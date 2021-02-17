package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBeans;

public class Mainclass {

	public static void main(String[] args) {

	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
	TestBeans t1=ctx.getBean("t1", TestBeans.class);
	
	TestBean2 t2=(TestBean2)ctx.getBean("t2");
	
	
	ctx.close();
	}

}
