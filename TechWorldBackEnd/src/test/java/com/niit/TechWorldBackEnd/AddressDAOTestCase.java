package com.niit.TechWorldBackEnd;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.TechWorldBackEnd.Dao.AddressDAO;
import com.niit.TechWorldBackEnd.model.Address;

public class AddressDAOTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static AddressDAO addressDAO;

	@Autowired
	static Address address;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.TechWorldBackEnd");
		context.refresh();

		addressDAO = (AddressDAO) context.getBean("addressDAO");

		address = (Address) context.getBean("address");

	}

	/*@Test
	public void createAddressTestCase() {
		address.setId("RajuAddress");
		address.setUser_id("Reddy");
		address.setH_no("3-789");
		address.setStreet("1th Road");
		address.setCity("Hyderabad");
		address.setCountry("India");
		address.setPin("502032");

		boolean flag = addressDAO.save(address);

		assertEquals("createAddressTestCase", true, flag);

	}

	@Test
	public void updateAddressTestCase() {
		address.setId("ReddyAddress");
		address.setUser_id("Reddy");
		address.setH_no("3-789");
		address.setStreet("1th Road");
		address.setCity("Hyderabad");
		address.setCountry("India");
		address.setPin("502032");

		boolean flag = addressDAO.update(address);

		assertEquals("createAddressTestCase", true, flag);

	}

	@Test
	public void listAllAddressTestCase() {
		int actualSize = addressDAO.list().size();
		assertEquals(2, actualSize);
	}*/

}
