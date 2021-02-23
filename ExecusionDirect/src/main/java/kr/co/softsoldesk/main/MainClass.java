package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;

public class MainClass {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");

		
		TestBean1 t1 = ctx.getBean(TestBean1.class);
		TestBean2 t2 = ctx.getBean(TestBean2.class);
		kr.co.softsoldesk.beans2.TestBean1 t3 = ctx.getBean(kr.co.softsoldesk.beans2.TestBean1.class);
		t1.method1();
		
		System.out.println("----------------");
		
		t1.method1(100);
		System.out.println("-----------------------");
		t1.method1("String");
		System.out.println("-----------------------");
		t1.method1(30,50);
		System.out.println("-----------------------");
		t1.method1(30,"String");
		System.out.println("--------------------------");
		t1.method2();
		System.out.println("--------------------------");
		t1.methodInt(100);
		System.out.println("----------------");
		t2.method1();
		System.out.println("----------------");
		t3.method1();
	}
}
