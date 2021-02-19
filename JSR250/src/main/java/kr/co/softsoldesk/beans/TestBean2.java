package kr.co.softsoldesk.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;

public class TestBean2 {

	public TestBean2() {
	System.out.println("TestBean2의 생성자 ");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("TestBean2의 Init메소드");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("TestBean2의 destroy메소드");
	}
}
