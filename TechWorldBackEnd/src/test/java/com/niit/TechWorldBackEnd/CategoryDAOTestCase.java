package com.niit.TechWorldBackEnd;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.TechWorldBackEnd.Dao.CategoryDAO;
import com.niit.TechWorldBackEnd.model.Category;



public class CategoryDAOTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static CategoryDAO categoryDAO;

	@Autowired
	static Category category;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		


		category = (Category) context.getBean("category");

	}

	
	/*@Test
	public void createCategoryTestCase() {
		category.setId("Mobiles");
		category.setName("Mobiles");
		category.setDescription("This category contains Top Mobiles");

		boolean flag = categoryDAO.save(category);

		assertEquals("createCategoryTestCase", true, flag);

	}
	
*/
	/*@Test
	public void updateCategoryTestCase() {
		category.setId("Mobiles");
		category.setName("Mobiles");
		category.setDescription("This category contains smart phones");

		boolean flag = categoryDAO.update(category);

		assertEquals("updateCategoryTestCase", true, flag);

	}

	@Test
	public void deleteCategoryTestCase() {
		category.setName("Mobiles");
		boolean flag = categoryDAO.delete(category.getName());

		assertEquals("deleteCategoryTestCase", true, flag);

	}
*/
/*	@Test
	public void listAllCategoryTestCase() {
		int actualSize = categoryDAO.list().size();
		assertEquals(6, actualSize);
	}
*/
}
