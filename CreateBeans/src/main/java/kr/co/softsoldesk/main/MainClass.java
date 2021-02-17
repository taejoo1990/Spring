package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBeans;

public class MainClass {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
	
	//id가 t1인 객체의 주소를 받아 옴(single tone)
	TestBeans t1=ctx.getBean("Test1", TestBeans.class);
	System.out.printf("t1 : %s\n", t1);	
	
	TestBeans t2=ctx.getBean("Test1", TestBeans.class);
	System.out.printf("t2 : %s\n", t2);
	
	//xml에서 lazy속성이 있어서 생성자를 호출하지 않는다.
	TestBeans t3=ctx.getBean("Test2", TestBeans.class);
	System.out.printf("t3 : %s\n", t3);
	
	//scope를 사용하여 새 객체생성 //각기 다른 메모리주소를 가짐.
	TestBeans t4=ctx.getBean("Test3", TestBeans.class);
	System.out.printf("t4 : %s\n", t4);
	TestBeans t5=ctx.getBean("Test3", TestBeans.class);
	System.out.printf("t5 : %s\n", t5);
	
	
	ctx.close();
	}

	
}
