package com.cn.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.data.pojo.Product;
import com.cn.data.service.ProductService;

@RestController
public class ProductServiceController {

	@Autowired
	ProductService productService;

	@RequestMapping("/products")
	public Object products() {
		List<Product> ps = productService.listProducts();
		System.out.println("生活在于折腾！");
		return ps;
	}
}
