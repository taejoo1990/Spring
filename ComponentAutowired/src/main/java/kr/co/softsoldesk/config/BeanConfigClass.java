package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;
import kr.co.softsoldesk.beans.DataBean5;
import kr.co.softsoldesk.beans.TestBean3;

@Configuration
@ComponentScan(basePackages = "kr.co.softsoldesk.beans")
public class BeanConfigClass {

	@Bean(name="obj4")
	public DataBean3 obj4() {
		return new DataBean3();
	}
	
	@Bean(name="obj5")
	public DataBean3 obj5() {
		return new DataBean3();
	}
	
	@Bean(name="t3")
	public TestBean3 t3() {
		DataBean4 d4 = new DataBean4();
		DataBean5 d5 = new DataBean5();
		TestBean3 t3 = new TestBean3(4,"아아", 3.6, d4, d5);
		return t3;
	}
	
	
}
