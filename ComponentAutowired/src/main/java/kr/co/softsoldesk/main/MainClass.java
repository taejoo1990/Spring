package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		
	//Component를 사용하기 위한 객체선언
	AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext(BeanConfigClass.class);
	
	//TestBean1에서 Resource활용
	TestBean1 t1 = ann.getBean(TestBean1.class);
	System.out.printf("t1.data1 : %s\n", t1.getData1());
	System.out.printf("t1.data2 : %s\n", t1.getData2());
	System.out.printf("t1.data3 : %s\n", t1.getData3());
	System.out.printf("t1.data4 : %s\n", t1.getData4());
	System.out.printf("t1.data5 : %s\n", t1.getData5());
	
	//TestBean2에서 생성자를 통한 주입확인
	TestBean2 t2 = ann.getBean(TestBean2.class);	
	System.out.printf("t2.data1 : %d\n", t2.getData1());
	System.out.printf("t2.data2 : %s\n", t2.getData2());
	System.out.printf("t2.data3 : %f\n", t2.getData3());
	System.out.printf("t2.data4 : %s\n", t2.getData4());
	System.out.printf("t2.data5 : %s\n", t2.getData5());
	
	//TestBean3에서 생성자와 메서드를 통한 주입확인.
	TestBean3 t3 = ann.getBean("t3",TestBean3.class);
	System.out.printf("t3.data1 : %d\n", t3.getData1());
	System.out.printf("t3.data2 : %s\n", t3.getData2());
	System.out.printf("t3.data3 : %f\n", t3.getData3());
	System.out.printf("t3.data4 : %s\n", t3.getData4());
	System.out.printf("t3.data5 : %s\n", t3.getData5());		

	ann.close();
	}
}
