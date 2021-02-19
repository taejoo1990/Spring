package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;

@Configuration
public class BeanConfigClass {

	
	@Bean
	@Scope("prototype")
	public TestBean1 java1() {
		TestBean1 t1= new TestBean1();
		return t1;
	}
	
	@Bean
	@Lazy
	public TestBean1 java2() {
		TestBean1 t1= new TestBean1();
		return t1;
	}
	
	@Bean(name="java600")
	//@Bean
	public TestBean1 java500() {
		TestBean1 t1= new TestBean1();
		return t1;
	}

	@Bean(name="scope")
	@Scope("prototype")
	@Lazy
	public TestBean3 javaScope() {
		TestBean3 t3 = new TestBean3();
		return t3;
	}
	
	@Bean
	public TestBean4 javaPrimary() {
		TestBean4 t4 = new TestBean4();
		return t4;
}
	@Primary
	@Bean
	public TestBean4 javaPrimary2() {
		TestBean4 t4 = new TestBean4();
		return t4;
	}
}
