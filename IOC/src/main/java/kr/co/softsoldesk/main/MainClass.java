package kr.co.softsoldesk.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();

	}

	// 옛날방식 BeanFactory 방식
	// BeanFactory -> 패키지 내부(3.x.version에서 사용)
	public static void test1() {
		//경로로 지정되는 객체
		ClassPathResource res=new ClassPathResource("kr/co/softsoldesk/config/bean.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		TestBean t1=factory.getBean("bean", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2=factory.getBean("bean", TestBean.class);
		System.out.printf("t2 : %s\n", t2);

	}

	// package 외부의 bean.xml파일을 참조
	public static void test2() {
		FileSystemResource res = new FileSystemResource("bean.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		TestBean t1 = factory.getBean("bean", TestBean.class);
		System.out.printf("t1 : %s\n", t1);

		TestBean t2 = factory.getBean("bean", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
	}

	// applicationcontext(패키지내부)
	public static void test3() {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("kr/co/softsoldesk/config/bean.xml");
		TestBean t1 = ctx.getBean("bean", TestBean.class);
		ctx.close();
	}

	// applicationcontext(패키지외부)
	public static void test4() {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("bean.xml");
		TestBean t1 = ctx.getBean("bean", TestBean.class);
		ctx.close();
	}
}
