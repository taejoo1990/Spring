package kr.co.softsoldesk.testbeanprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanProcessor implements BeanPostProcessor {

	//호출 전
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before");
		
		switch (beanName) {
		case "t1":
			System.out.println("t1");
			break;
		case "t2":
			System.out.println("t2");
			break;
		default:
			break;
		}
		
		return bean;
	}

	//호출 후
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after");
		return bean;
	}

	
	
}
