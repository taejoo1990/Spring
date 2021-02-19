package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.beans.TestBean5;
import kr.co.softsoldesk.beans.TestBean6;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext anno=new AnnotationConfigApplicationContext(BeanConfigClass.class);
	TestBean1 obj1=anno.getBean("java1", TestBean1.class);	
	TestBean2 obj2=anno.getBean("java2", TestBean2.class);

	
	TestBean3 obj3=anno.getBean("java3", TestBean3.class);
	System.out.printf("obj3.data1 : %s\n", obj3.getData1() );
	System.out.printf("obj3.data2 : %s\n", obj3.getData2() );
	
	TestBean4 obj4=anno.getBean("java4", TestBean4.class);
	System.out.printf("obj4.data1 : %s\n", obj4.getData1() );
	System.out.printf("obj4.data2 : %s\n", obj4.getData2() );
	
	TestBean5 obj5=anno.getBean("java5", TestBean5.class);
	System.out.printf("obj5.data1 : %s\n", obj5.getData1() );
	System.out.printf("obj5.data2 : %s\n", obj5.getData2() );
	
	TestBean6 obj6=anno.getBean("java6", TestBean6.class);
	System.out.printf("obj6.data1 : %s\n", obj6.getData100() );
	System.out.printf("obj6.data2 : %s\n", obj6.getData200() );
	
	anno.close();
	}
}
