package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		System.out.println("========================XML================================ \n");
		
		System.out.println("--------------생성자를 통한 주입----------------");
		TestBean xml1=ctx.getBean("xml1", TestBean.class);
		System.out.printf("xml1.data1 : %d\n",xml1.getData1());
		System.out.printf("xml1.data2 : %s\n",xml1.getData2());
		System.out.printf("xml1.data3 : %s\n",xml1.getData3());
		System.out.println();
		System.out.println("\n--------------setter를 통한 주입----------------");
		TestBean xml2=ctx.getBean("xml2", TestBean.class);
		System.out.printf("xml2.data1 : %d\n",xml2.getData1());
		System.out.printf("xml2.data2 : %s\n",xml2.getData2());
		System.out.printf("xml2.data3 : %s\n",xml2.getData3());
		System.out.println();
		
		System.out.println("\n--------------AutoWire를 통한 주입----------------");
		System.out.println("--------------ByName----------------");
		TestBean2 xml3=ctx.getBean("xml3", TestBean2.class);
		System.out.printf("xml3.data1 : %s\n",xml3.getData1());
		System.out.printf("xml3.data2 : %s\n",xml3.getData2());
		System.out.println();
		System.out.println("--------------ByType----------------");
		TestBean3 xml4=ctx.getBean("xml4", TestBean3.class);
		System.out.printf("xml4.data1 : %s\n",xml4.getData1());
		System.out.printf("xml4.data2 : %s\n",xml4.getData2());
		System.out.println();
		ctx.close();
		
		System.out.println("======================Annotation============================\n");
		
		System.out.println("----------------생성자를 통한 주입------------------");
		TestBean java1=ctx2.getBean("java1", TestBean.class);
		System.out.printf("java1.data1 : %d\n",java1.getData1());
		System.out.printf("java1.data2 : %s\n",java1.getData2());
		System.out.printf("java1.data3 : %s\n",java1.getData3());
		System.out.println();
		
		System.out.println("\n--------------setter를 통한 주입----------------");
		TestBean java2=ctx2.getBean("java2", TestBean.class);
		System.out.printf("java2.data1 : %d\n",java2.getData1());
		System.out.printf("java2.data2 : %s\n",java2.getData2());
		System.out.printf("java2.data3 : %s\n",java2.getData3());
		System.out.println();
		
		System.out.println("\n--------------AutoWire를 통한 주입----------------");
		System.out.println("--------------ByName----------------");
		TestBean2 java3=ctx2.getBean("java3", TestBean2.class);
		System.out.printf("java3.data1 : %s\n",java3.getData1());
		System.out.printf("java3.data2 : %s\n",java3.getData2());
		System.out.println();
		System.out.println("--------------ByType----------------");
		TestBean3 java4=ctx2.getBean("java4", TestBean3.class);
		System.out.printf("java4.data1 : %s\n",java4.getData1());
		System.out.printf("java4.data2 : %s\n",java4.getData2());
		System.out.println();
		ctx2.close();
	}

}
