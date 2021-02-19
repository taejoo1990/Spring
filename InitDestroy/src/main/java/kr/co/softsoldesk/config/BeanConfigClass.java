package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.co.softsoldesk.beans.TestBean;
@Configuration

public class BeanConfigClass {
	
	@Bean(name="java1", initMethod = "init", destroyMethod = "destroy")
	@Lazy
	public TestBean Java1() {
		TestBean t1 = new TestBean();
		return t1;
	}
	


}
