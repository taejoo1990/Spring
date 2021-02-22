package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans2.TestBean4;

@Configuration
@ComponentScan(basePackages="kr.co.softsoldesk.beans2")
@ComponentScan(basePackages="kr.co.softsoldesk.beans3")
public class BeanConfigClass {

	
	//Type선언
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	@Bean(name="java2_1")
	public TestBean2 java2_1() {
		return new TestBean2();
	}
	@Bean(name="java2_2")
	public TestBean2 java2_2() {
		return new TestBean2();
	}
	@Bean(name="java4_1")
	public TestBean4 java4_1() {
		return new TestBean4();
	}
	@Bean(name="java4_2")
	public TestBean4 java4_2() {
		return new TestBean4();
	}
}
