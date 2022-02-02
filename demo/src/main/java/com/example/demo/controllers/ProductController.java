package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Product;
import com.example.demo.services.ProductService;

@Controller
public class ProductController {
	
	@Autowired  
	private ProductService productService;  
	//mapping the getProduct() method to /product  
	
	@RequestMapping("home")
	public String home() {
		System.out.println("method executed");
		return "form";
		
	}

	@RequestMapping("homea")
	public String homea(Model model) {
		System.out.println("method executed");
		List<Product> products = productService.findAll();  
		model.addAttribute("products", products);
		return "view_receipes";
		
	}
	
	@RequestMapping("homeb")
	public String homeb(Product product) {
		productService.addProduct(product);
		return "formA";
		
	}
}
