package com.shop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shop.daos.ProductDao;
import com.shop.models.Product;

@Controller
public class ProductControllers {
	
	@Autowired
	ProductDao productDao;
	
	@RequestMapping(value="/getAddProductForm" , method=RequestMethod.GET)
	public String getProductForm(ModelMap map)
	{
		map.addAttribute("productObj",new Product());
		return "addProduct";
	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute Product productObj )
	{
		productDao.addProduct(productObj);
		return "success";
	}
	
	@RequestMapping(value="/getAllProduct",method=RequestMethod.GET)
	public String getAllProduct(ModelMap map)
	{
		List<Product> pList = productDao.getAllProducts();
		map.addAttribute("pList",pList);
		return "viewProduct";
	}

}