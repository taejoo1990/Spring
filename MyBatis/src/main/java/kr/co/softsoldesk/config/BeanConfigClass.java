package kr.co.softsoldesk.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.mapper.MapperInterface;

@Configuration
@ComponentScan(basePackages ="kr.co.softsoldesk.beans" )
public class BeanConfigClass {

	
	//DataSource
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource source = new BasicDataSource();
		
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("system");
		source.setPassword("12345");
		return source;
	}

	//sqlsessionFactory : jdbc를 처리하는 객체
	
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception{
		
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		//접속 성공
		factoryBean.setDataSource(source);
		SqlSessionFactory factory=factoryBean.getObject();
		
		return factory;
	}
	//MapperFactoryBean에 SQL쿼리를 구현함 -> 이름을 Test_Mapper로함
	@Bean
	public MapperFactoryBean<MapperInterface> test_Mapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<MapperInterface> factoryBean = new MapperFactoryBean<MapperInterface>(MapperInterface.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
	
	
}
