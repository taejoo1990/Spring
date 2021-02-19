package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.TestBean1;

@Configuration
public class BeanConfigClass {

	@Bean(name="java1")
	public TestBean1 java1() {
		TestBean1 t1= new TestBean1();
		return new TestBean1();
	}
	
}
