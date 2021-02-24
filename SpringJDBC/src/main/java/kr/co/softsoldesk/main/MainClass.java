package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.db.JdbcDAO;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		JdbcDAO dao = ann.getBean(JdbcDAO.class);
		JdbcBean bean1 = ann.getBean(JdbcBean.class);
		
		//Insert기능을 이용.
		/*
		 * bean1.setInt_data(1000); bean1.setStr_data("안 되서 테스트용으로 돌림");
		 * dao.insert_data(bean1);
		 */
		//Select기능을 이용.
		
		List<JdbcBean> list = dao.select_data();
		
		for (JdbcBean tmp : list) {
			System.out.printf("int_data %d\n", tmp.getInt_data());
			System.out.printf("String_data %s\n", tmp.getStr_data());
			System.out.println("-----------------------------------");
		}
		
		ann.close();
	}

}
