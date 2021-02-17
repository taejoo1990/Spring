package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean1 t1=ctx.getBean("t1", TestBean1.class);
		
		ctx.close();

	}

}
