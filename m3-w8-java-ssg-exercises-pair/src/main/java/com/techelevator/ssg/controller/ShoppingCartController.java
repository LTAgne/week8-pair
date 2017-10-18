package com.techelevator.ssg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;

@Controller
public class ShoppingCartController {
	
	@Autowired
	ProductDao productDao;
	
	
	@RequestMapping("/shoppingCart/index")
	public String shoppingCart(ModelMap modelHolder){
		List<Product> products = productDao.getAllProducts();
		modelHolder.put("products", products);
		return "shoppingCart";
	}

	@RequestMapping("/shoppingCart/detail/{id}")
	public String productDetail(ModelMap modelHolder, @PathVariable Long id){
	modelHolder.put("product", productDao.getProductById(id));	
	return "productDetail";
	}
}
