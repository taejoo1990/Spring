package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans2.TestBean3;
import kr.co.softsoldesk.beans2.TestBean4;
import kr.co.softsoldesk.beans3.TestBean5;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		
		System.out.println("XML사용");
		//config 패키지의 beans.xml의bean들을 사용하도록 선언
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//클래스 type으로 빈을 불러오는방식
		TestBean1 xml1=xml.getBean(TestBean1.class);
		System.out.printf("XML1 : %s\n", xml1);
		
		//ID로 식별하여 가져오는 방법. Type방식에 비해 유이한 ID를 갖기 때문에 모호성에 빠지지 않음.
		TestBean2 xml2_1=xml.getBean("xml2_1",TestBean2.class);
		System.out.printf("XML2_1 : %s\n", xml2_1);
		
		TestBean2 xml2_2=xml.getBean("xml2_2",TestBean2.class);
		System.out.printf("XML2_2 : %s\n", xml2_2);
		
		//Component로 분석하여 가져오기. 싱글톤
		TestBean3 xml3_1=xml.getBean(TestBean3.class);
		System.out.printf("XML3_1 : %s\n", xml3_1);
		TestBean3 xml3_2=xml.getBean(TestBean3.class);
		System.out.printf("XML3_2 : %s\n", xml3_2);
		
		//Componetn에 id를 부여하여 분석하여 가져오기
		TestBean4 xml4 = xml.getBean("bean4", TestBean4.class);
		System.out.printf("XML4 : %s\n", xml4);
		
		//Componet사용시 다수 ID부여가 불가하기에, Component가 선언된 상태로 기존방식으로 불러오기.
		TestBean4 xml4_1 = xml.getBean("xml4_1", TestBean4.class);	
		System.out.printf("XML4_1 : %s\n", xml4_1);
		TestBean4 xml4_2 = xml.getBean("xml4_2", TestBean4.class);	
		System.out.printf("XML4_2 : %s\n", xml4_2);
		
		//다수 패키지 등록 후 사용
		TestBean5 xml5 = xml.getBean(TestBean5.class);	
		System.out.printf("XML5 : %s\n", xml5);
		
		//자원반환
		xml.close();
		
		
		
		System.out.println("------------------------------------------------------------------------------\n");
		
		
		System.out.println("Annotation사용");
		//config 패키지의 BeanConfigClass.java의 annotation bean들을 사용하도록 선언.
		AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//Class Type으로 bean을 가져 오는 방식.
		TestBean1 java1=ann.getBean(TestBean1.class);
		System.out.printf("java1 : %s\n" , java1);
		
		//ID로 식별하여 가져오는 방법. Type방식에 비해 유이한 ID를 갖기 때문에 모호성에 빠지지 않음.
		TestBean2 java2_1=ann.getBean("java2_1",TestBean2.class);
		System.out.printf("java2_1 : %s\n" , java2_1);
		
		TestBean2 java2_2=ann.getBean("java2_2",TestBean2.class);
		System.out.printf("java2_2 : %s\n" , java2_2);
		
		//Component로 분석하여 가져오기. 싱글톤
		TestBean3 java3_1=ann.getBean(TestBean3.class);
		System.out.printf("java3_1 : %s\n" , java3_1);
		TestBean3 java3_2=ann.getBean(TestBean3.class);
		System.out.printf("java3_2 : %s\n" , java3_2);
		
		
		//Componetn에 id를 부여하여 분석하여 가져오기
		TestBean4 java4=ann.getBean("bean4", TestBean4.class);
		System.out.printf("java4 : %s\n" , java4);
		
		//Componet사용시 다수 ID부여가 불가하기에, Component가 선언된 상태로 기존방식으로 불러오기.
		TestBean4 java4_1 = ann.getBean("java4_1", TestBean4.class);	
		System.out.printf("java4_1 : %s\n", java4_1);
		TestBean4 java4_2 = ann.getBean("java4_2", TestBean4.class);	
		System.out.printf("java4_2 : %s\n", java4_2);
		
		//다수 패키지 등록 후 사용
		TestBean5 java5 = ann.getBean(TestBean5.class);	
		System.out.printf("java5 : %s\n", java5);
		
		//자원반환.
		ann.close();
	}

}
