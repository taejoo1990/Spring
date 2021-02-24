package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.mapper.MapperInterface;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MapperInterface mapper = ann.getBean("test_Mapper", MapperInterface.class);
		
		//insert
		/*
		 * JdbcBean bean2=new JdbcBean(); bean2.setInt_data(100);
		 * bean2.setStr_data("Spring 2021"); mapper.insert_data(bean2);
		 */
		
		//update
		
		/*
		 * JdbcBean bean3=new JdbcBean(); bean3.setInt_data(1001);
		 * bean3.setStr_data("업데이트 해서 바꾼거"); mapper.updata_data(bean3);
		 */
		 
		//delete 
		
		 JdbcBean bean4 = new JdbcBean();
		 mapper.delete_data(99);
		 
		List<JdbcBean> list1=mapper.select_data();
		
		for(JdbcBean tmp : list1) {
			System.out.printf("data1 : %s\n", tmp.getInt_data());
			System.out.printf("data2 : %s\n", tmp.getStr_data());
		}
		ann.close();

	}

}
