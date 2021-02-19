package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		ctx.getBean("xml1", TestBean.class);
		AnnotationConfigApplicationContext ctx2= new AnnotationConfigApplicationContext(BeanConfigClass.class);
		ctx2.getBean("java1", TestBean.class);
		ctx.close();
		ctx2.close();
	}

}
