package kr.co.softsoldesk.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;
import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;

@Configuration
public class BeanConfigClass {

	//@Required // 스프링 5버전부터는 기능하지 않음.
	//생성자를 생성하여 매개변수가 필수적으로 들어가지 않으면 객체생성이 되지 않도록 유도하여 required구현가능
	@Bean(name = "java1", autowire = Autowire.BY_TYPE)
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return new TestBean1();
	}
	@Bean(name="java2")
	public TestBean2 java2() {
		return new TestBean2();
	}
	
	@Bean
	public DataBean3 data3() {
		return new DataBean3();
	}
	@Bean
	public DataBean4 data4() {
		return new DataBean4();
	}
	
	@Bean
	public DataBean1 data_bean1() {
		return new DataBean1();
	}
	
	@Bean(name="obj4")
	public DataBean2 obj4() {
	return new DataBean2();
}
	@Bean(name="obj5")
	public DataBean2 obj5() {
		return new DataBean2();
	}
}