package kr.co.softsoldesk.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.beans.TestBean5;
import kr.co.softsoldesk.beans.TestBean6;

@Configuration
public class BeanConfigClass {

	
	@Bean(initMethod = "init", destroyMethod = "destroy", name="java1")
	@Lazy
	public TestBean1 obj1() {
	TestBean1 t1=new TestBean1();
	return t1;
	}
	
	@Bean(name="java2")
	@Lazy
	public TestBean2 obj2() {
	TestBean2 t2=new TestBean2();
	return t2;
	}
	
	@Bean(name="java3", autowire = Autowire.BY_NAME)
	@Lazy
	public TestBean3 obj3() {
	TestBean3 t3=new TestBean3();
	return t3;
	}
	
	@Bean(name="java4", autowire = Autowire.BY_NAME)
	@Lazy
	public TestBean4 obj4() {
		TestBean4 t4=new TestBean4();
		return t4;
	}
	@Bean(name="java5", autowire = Autowire.BY_NAME)
	@Lazy
	public TestBean5 obj5() {
		TestBean5 t5=new TestBean5();
		return t5;
	}
	@Bean(name="java6", autowire = Autowire.BY_NAME)
	@Lazy
	public TestBean6 obj6() {
		TestBean6 t6=new TestBean6();
		return t6;
	}
	
	@Bean(name="data1")
	public DataBean1 data1() {
		return new DataBean1();
	}
	@Bean(name="data2")
	public DataBean2 data2() {
		return new DataBean2();
	}
	
}
