package com.eample;

import org.springframework.jdbc.core.JdbcTemplate;


public class GroceriesDao {

	
	// use jdbctemplate
		private JdbcTemplate jdbcTemplate;

		public JdbcTemplate getjdbcTemplate() {
			return jdbcTemplate;
		}

		public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

		// insert agent details
		public int saveGroceries(Groceries g)

		{
			String query = "insert into groceries(id,name,price,quantity) value(?,?,?,?)";
			return jdbcTemplate.update(query, g.getId(), g.getName() , g.getPrice(), g.getQuantity());
		}

		// update agent details
		public int updateGroceries(Groceries a) {
			String query = "update groceries set name='" + a.getName() +"',price='" +a.getPrice() + "',quantity='" + a.getQuantity()
					+ "' where id='" + a.getId() + "' ";
			return jdbcTemplate.update(query);
		}

		// delete agent details
		public int deleteGroceries(Groceries a) {
			String query = "delete From groceries where id='" + a.getId() + "' ";
			return jdbcTemplate.update(query);
		}
}
