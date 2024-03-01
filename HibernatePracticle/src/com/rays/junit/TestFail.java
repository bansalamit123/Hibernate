package com.rays.junit;

import org.junit.Test;
import static org.junit.Assert.fail;

public class TestFail {

	@Test
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		bean.setId(5);
		bean.setName("abc");
		bean.setSalary(6000);

		UserModel.add(bean);
		
		bean = UserModel.findByPk(5);

		if (bean == null) {

			fail("Record is not added...!!!");

		} else {
			System.out.println("record is added..!!!");
		}

	}

}
