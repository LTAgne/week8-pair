package com.techelevator.ssg.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;
import com.techelevator.ssg.model.store.ShoppingCart;

@Controller
public class ShoppingCartController {
	
	@Autowired
	ProductDao productDao;
	
	
	@RequestMapping(path="/shoppingCart/index" , method=RequestMethod.GET)
	public String shoppingCart(ModelMap modelHolder){
		List<Product> products = productDao.getAllProducts();
		modelHolder.put("products", products);
		return "shoppingCart";
	}

	@RequestMapping(path="/shoppingCart/detail/{id}" , method=RequestMethod.GET)
	public String productDetail(ModelMap modelHolder, @PathVariable Long id){
	modelHolder.put("product", productDao.getProductById(id));	
	return "productDetail";
	}
	
	@RequestMapping(path="/shoppingCart/addToCart", method=RequestMethod.POST)
	public String addProductToCart(@RequestParam Long productId, @RequestParam Integer quantity, HttpSession session){
		if(session.getAttribute("shoppingCart") == null) {
			session.setAttribute("shoppingCart", new ShoppingCart());
		}
		
		ShoppingCart sc = (ShoppingCart) session.getAttribute("shoppingCart");
		sc.addProduct(productId, quantity);
		
		return "redirect:/shoppingCart/view";
	}
	
	@RequestMapping(path="/shoppingCart/view", method=RequestMethod.GET)
	public String showShoppingCart(HttpSession session, ModelMap modelHolder){
		Map<Product, Integer> productList = new HashMap<>();
		ShoppingCart sc = (ShoppingCart) session.getAttribute("shoppingCart");
		if (sc != null){
			Map<Long, Integer> shoppingCartProducts = sc.getAllProducts();
			for(Long productId : shoppingCartProducts.keySet()) {
				Product currentProduct = productDao.getProductById(productId);
				productList.put(currentProduct, shoppingCartProducts.get(productId));
			}
		} 
		modelHolder.put("productList", productList);
		return "cartView";
	}


}
