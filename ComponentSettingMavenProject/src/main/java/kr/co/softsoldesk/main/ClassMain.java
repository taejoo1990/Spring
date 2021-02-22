package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.beans.TestBean5;
import kr.co.softsoldesk.config.BeanConfigClass;

public class ClassMain {

	public static void main(String[] args) {
		
		//BeanConfigClass.java에 있는 bean을 사용하기 위하여 ACAC 객체선언.
		AnnotationConfigApplicationContext ann=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//Conponent된 TestBean1의 객체생성 후 출력 (싱글톤)
		TestBean1 t1 = ann.getBean(TestBean1.class);
		System.out.printf("t1 : %s\n" , t1);
		TestBean1 t1_1 = ann.getBean(TestBean1.class);
		System.out.printf("t1 : %s\n" , t1_1);
		
		//Component된 TestBean2에 "t2"라는 ID를 주어 객체생성 후 출력
		//이름을 사용해도, 싱글톤으로 활용되기 때문에 타입으로 하는 것과 별반 차이가 없음.
		//prototype을 주어 싱글톤이 아닌 다른 주소로 반영.
		TestBean2 t2 = ann.getBean("t2", TestBean2.class);
		System.out.printf("t2 : %s\n" , t2);
		
		TestBean2 t2_1 = ann.getBean("t2", TestBean2.class);
		System.out.printf("t2_1 : %s\n" , t2_1);
		
		//TestBean2클래스 생성된 bean
		TestBean2 t2_2 = ann.getBean("t2_2", TestBean2.class);
		System.out.printf("t2_2 : %s\n" , t2_2);
		
		//BeanConfigClass클래스 생성된 bean
		TestBean2 t2_3 = ann.getBean("t2_3", TestBean2.class);
		System.out.printf("t2_3 : %s\n" , t2_3);
		//자원반납.
		
		//각기 다른 객체 생성
		TestBean3 t3 = ann.getBean(TestBean3.class);
		System.out.printf("t3 : %s\n" , t3);
		TestBean3 t3_1 = ann.getBean(TestBean3.class);
		System.out.printf("t3_1 : %s\n" , t3_1);
		
		//Scope를 이용한 각기 다른 주소의 객체생성
		TestBean4 t4 = ann.getBean(TestBean4.class);
		System.out.printf("t4 : %s\n" , t4);
		TestBean4 t4_1 = ann.getBean(TestBean4.class);
		System.out.printf("t4_1 : %s\n" , t4_1);
		
		
		//component된 TestBean5를 호출하여 postconstructor와 predistroy를 통해 initd,destroy메소드가 반영되는지 확인.
		TestBean5 t5 = ann.getBean(TestBean5.class);
		System.out.printf("t5 : %s\n" , t5);
		
		ann.close();
	}

}
