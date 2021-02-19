package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("==============XML===============");
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean1 xml1 = ctx.getBean("xml1", TestBean1.class);
		System.out.printf("xml1.data1 : %s\n", xml1.getData1());
		
		
		ctx.close();
		
		
		System.out.println("==============JAVA===============");
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1 = ctx2.getBean("java1", TestBean1.class);
		System.out.printf("java1.data1 : %s\n", java1);

		ctx2.close();
	}

}
