package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.config.BeanConfigClass;


public class MainClass {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
	TestBean1 xml1=ctx.getBean("xml1", TestBean1.class);
	System.out.println("---------XML방식의 주소값 가져오기----------");
	System.out.printf("xml1 : %s\n", xml1);

	TestBean2 xml11=ctx.getBean("xml11", TestBean2.class);
	System.out.println("---------XML방식의 주소값 가져오기----------");
	System.out.printf("xml1 : %s\n", xml11);
	
	
	
	
	AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
	System.out.println("---------annotation 방식의 주소값 가져오기----------");
	System.out.println();
	System.out.println("여기서 부터는 어노테이션방식의 주소부르기와 scope를 통한 각각 주소 부여");
	TestBean1 java1 = ctx2.getBean("java1", TestBean1.class);
	TestBean1 java11 = ctx2.getBean("java1", TestBean1.class);
	System.out.printf("xml1 : %s\n", java1);
	System.out.printf("xml1 : %s\n", java11);
	System.out.println("---------------------- 메서드 이름으로 호출하기");

	//원래 메서드명은 java500이지만, 어노테이션으로 주소를 명시하여 주었다.
	//원래 기본값은 메서드값이지만, 다른 이름으로 설정을 해줄 수 있다.
	//TestBean1 java500=ctx2.getBean("java500", TestBean1.class);
	
	
	System.out.println();
	System.out.println("-----------------------------------------");
	System.out.println("여기서 부턴 어노테이션에 이름을 지정.");
	TestBean1 java500=ctx2.getBean("java600", TestBean1.class);
	System.out.printf("java500 : %s\n ", java500);
	
	
	
	System.out.println();
	System.out.println("-----------------------------------------");
	System.out.println("여기서 부턴 lazy 어노테이션");
	TestBean1 java2=ctx2.getBean("java2" , TestBean1.class);
	
	
	
	System.out.println();
	System.out.println("-----------------------------------------");
	System.out.println("여기서 부턴 기존 XML연계방식의 Scope사용");
	System.out.println();
	TestBean3 xmlScope=ctx2.getBean("scope", TestBean3.class);
	TestBean3 xmlScope2=ctx2.getBean("scope", TestBean3.class);
	System.out.printf("xmlScope : %s\n" , xmlScope);
	System.out.printf("xmlScope : %s\n" , xmlScope2);
	
	
	System.out.println();
	System.out.println("-----------------------------------------");
	System.out.println("여기서부턴 scope,lazy,bean주소설정을 모두 함.");
	System.out.println();
	TestBean3 javaScope=ctx2.getBean("scope", TestBean3.class);
	TestBean3 javaScope2=ctx2.getBean("scope", TestBean3.class);
	System.out.printf("javaScope : %s\n", javaScope);
	System.out.printf("javaScope : %s\n", javaScope2);
	
	
	System.out.println("-- XML연계 클래스 중복 호출시 에러 없이 정상적인 주소 반환하기");
	System.out.println();
	System.out.println("------------------------");
	TestBean4 xml4=ctx.getBean(TestBean4.class);
	System.out.printf("xml4 : %s\n" , xml4);
	
	System.out.println("-- 자바연계 클래스 중복 호출시 에러 없이 정상적인 주소 반환하기");
	System.out.println();
	System.out.println("------------------------");
	
	TestBean4 Javaprimary=ctx2.getBean("javaPrimary2", TestBean4.class);
	System.out.printf("JavaPrimary : %s\n" , Javaprimary);
	
	ctx.close();
	ctx2.close();
	}

}
