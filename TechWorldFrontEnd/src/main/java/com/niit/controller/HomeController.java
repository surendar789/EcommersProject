package com.niit.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.TechWorldBackEnd.Dao.CategoryDAO;
import com.niit.TechWorldBackEnd.Dao.My_CartDAO;
import com.niit.TechWorldBackEnd.Dao.ProductDAO;
import com.niit.TechWorldBackEnd.Dao.SupplierDAO;
import com.niit.TechWorldBackEnd.model.Category;
import com.niit.TechWorldBackEnd.model.My_Cart;
import com.niit.TechWorldBackEnd.model.Product;
import com.niit.TechWorldBackEnd.model.Supplier;


@Controller
public class HomeController {
	private static Logger log = LoggerFactory.getLogger(ProductController.class);


	@Autowired
	HttpSession session;

	@Autowired
	Category category;

	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	Product product;

	@Autowired
	ProductDAO productDAO;

	@Autowired
	Supplier supplier;

	@Autowired
	SupplierDAO supplierDAO;

	@Autowired
	My_Cart myCart;

	@Autowired
	My_CartDAO myCartDAO;

	@RequestMapping("/")
	public ModelAndView goToHome() {
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("message", "Welcome To TechWorld! <br>");
		mv.addObject("isUserAtHomePage", "true");
		
		List<Category> categoryList = categoryDAO.list();

		session.setAttribute("categoryList", categoryList);
		session.setAttribute("category", category);

		
		List<Product> productList = productDAO.list();

		
		session.setAttribute("productList", productList);
		session.setAttribute("product", product);

		
		List<Supplier> supplierList = supplierDAO.list();
		
		session.setAttribute("supplierList", supplierList);
		session.setAttribute("supplier", supplier);
		

		return mv;
		
	}

	

	@RequestMapping("/Home")
	public ModelAndView goToHomeButton() {
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("message", "Welcome To TechWorld! <br>");
		mv.addObject("isUserAtHomePage", "true");
		
		
		List<Category> categoryList = categoryDAO.list();

		
		session.setAttribute("categoryList", categoryList);
		session.setAttribute("category", category);

		
		List<Product> productList = productDAO.list();

		
		session.setAttribute("productList", productList);
		session.setAttribute("product", product);

		
		List<Supplier> supplierList = supplierDAO.list();

		
		session.setAttribute("supplierList", supplierList);
		session.setAttribute("supplier", supplier);

		return mv;
		
	}

	@RequestMapping("/Login")
	public String loginPage(Model model) {
		model.addAttribute("isUserClickedLogin", "true");
		model.addAttribute("isUserAtHomePage", "false");

		Long currentTime = System.currentTimeMillis();
		Date currentDate = new Date(currentTime);
		return "Home";
	}
	
	@RequestMapping("/SignOut")
	public ModelAndView userSignOut() {
		log.debug("Signout Initiated");
		ModelAndView mv = new ModelAndView("redirect:/");
		session.setAttribute("isUserLoggedIn", "false");
		session.setAttribute("isAdmin", "false");

		return mv;
	}
	
	@RequestMapping("/RegistrationPage")
	public String registerPage(Model model) {
		model.addAttribute("isUserClickedRegistration", "true");
		model.addAttribute("isUserAtHomePage", "false");
		return "Home";
	}

	@RequestMapping("/MainPage")
	public String mainPage(Model model) {
		model.addAttribute("isUserClickedMain", "true");
		return "Home";
	}

	@RequestMapping("/ContactUs")
	public String contactUsPage(Model model) {
		model.addAttribute("isUserClickedContactUs", "true");
		model.addAttribute("isUserAtHomePage", "false");
		return "Home";
	}
}
