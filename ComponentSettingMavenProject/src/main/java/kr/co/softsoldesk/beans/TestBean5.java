package kr.co.softsoldesk.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean5 {
	
	public TestBean5() {
	System.out.println("TestBean5의 생성자");
	}
	
	@PostConstruct
	public void initMethod () {
		System.out.println("TestBean5의 initMethod");
	}
	@PreDestroy
	public void destoryMethod () {
		System.out.println("TestBean5의 destroyMethod");
	}
	
}
