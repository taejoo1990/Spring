package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/Beans.xml");
		
		TestBean1 bean1 = ctx.getBean("xml1", TestBean1.class);
		int a1=bean1.method1();
		System.out.println(a1);
		ctx.close();

	}

}
