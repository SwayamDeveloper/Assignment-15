package com.eample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class App {

	 public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
			String query = "update groceries set name='Swayam' where id=101";
			String SQL = "select * from groceries";
			GroceriesDao a1 = (GroceriesDao) context.getBean("a1");
			int st = a1.saveGroceries(new Groceries(11,"rice" ,134, "3Kg"));
		    int st1= a1.updateGroceries(new Groceries(12,"wheat" ,134, "4Kg"));
			int st2=a1.deleteGroceries(new Groceries(13,"Oil" ,24, "1Kg"));
			System.out.println(st2);
	    }

}
