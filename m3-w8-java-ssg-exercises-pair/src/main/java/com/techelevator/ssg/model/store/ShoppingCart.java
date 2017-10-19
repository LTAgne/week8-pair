package com.techelevator.ssg.model.store;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	Map<Long, Integer> productList = new HashMap<Long, Integer>();
	
	public void addProduct(Long productId, Integer quantity) {
		if(productList.containsKey(productId)){
			int oldQuantity = productList.get(productId);
			productList.put(productId, oldQuantity + quantity);
		} else {
			productList.put(productId, quantity);
		}
	}

	
	public void clear(){
		productList.clear(); 
	}

	public Map<Long, Integer> getAllProducts(){
		return new HashMap<Long, Integer>(productList);
	}


}
