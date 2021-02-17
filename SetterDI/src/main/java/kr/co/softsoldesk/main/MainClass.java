package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.SamsungTv;
import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		TestBean obj1=new TestBean();
		obj1.setData1(100);
		System.out.printf("obj1.data1 : %d\n" , obj1.getData1());
	
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		TestBean t1=ctx.getBean("t1", TestBean.class);
		
		System.out.printf("ctx.data1 : %d\n" , t1.getData1());
		System.out.printf("ctx.data2 : %f\n" , t1.getData2());
		System.out.printf("ctx.data3 : %s\n" , t1.isData3());
		System.out.printf("ctx.data4 : %s\n" , t1.getData4());
		System.out.printf("ctx.data5 : %s\n" , t1.getData5());
		System.out.printf("ctx.data6 : %s\n" , t1.getData6());
		
		
		SamsungTv t2=ctx.getBean("tv", SamsungTv.class);
		
		t2.powerOn();
		t2.powerOff();
		t2.volumeUp();
		t2.volumeDown();
	
	}

}
