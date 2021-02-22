package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import kr.co.softsoldesk.beans.TestBean2;

@Configuration
@ComponentScan(basePackages = "kr.co.softsoldesk.beans")
public class BeanConfigClass {
	
	@Bean(name="t2_3")
	public TestBean2 t2_3() {
		return new TestBean2();
	}
}
