package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------------------\n");
		System.out.println("---------------------Annotaion----------------------------------------");
		AnnotationConfigApplicationContext ann=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 t1 = ann.getBean(TestBean1.class);
		//t1.method1();
		
		
		try {
			t1.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ann.close();
		
		System.out.println("------------------------------------------------------------------\n");
		System.out.println("--------------------------XML----------------------------------------");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean1 xml1 =ctx.getBean(TestBean1.class);
		//xml1.method1();
		
		try {
			xml1.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ctx.close();
	}

}
