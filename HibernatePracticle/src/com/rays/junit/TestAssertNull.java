package com.rays.junit;

import org.junit.Test;

import junit.framework.TestCase;

public class TestAssertNull extends TestCase {
	@Test
	public void testFindByPk() throws Exception {

		UserBean bean = UserModel.findByPk(6);

		assertNull("user is null", bean);
		// assertTrue(bean == null);

	}

}
