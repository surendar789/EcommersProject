package com.niit.TechWorldBackEnd;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.TechWorldBackEnd.Dao.My_CartDAO;
import com.niit.TechWorldBackEnd.Dao.ProductDAO;
import com.niit.TechWorldBackEnd.model.My_Cart;
import com.niit.TechWorldBackEnd.model.Product;


public class My_CartDAOTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	Product product;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	static My_CartDAO my_CartDAO;
	@Autowired
	static My_Cart my_Cart;
	
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.TechWorldBackEnd");
		context.refresh();
		
		my_CartDAO =  (My_CartDAO) context.getBean("my_CartDAO");
		
		my_Cart = (My_Cart)context.getBean("my_Cart");
		
	}
	
	/*@Test
	public void createCartTestCase() {
		my_Cart.setUser_id("Raju");
		my_Cart.setPrice(15000);
		my_Cart.setProduct_name("Moto G5 Plus");
		
		boolean flag = my_CartDAO.save(my_Cart);
		
		assertEquals("createCartTestCase",true,flag);
	}
	
	@Test
	public void deleteCartTestCase(){
		boolean flag = my_CartDAO.deleteAllProductsInCart("Raju");
		
		assertEquals(true, flag);
	}*/
	

}
