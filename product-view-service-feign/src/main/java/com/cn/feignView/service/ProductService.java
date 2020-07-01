package com.cn.feignView.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.feignView.client.ProductClientFeign;
import com.cn.feignView.pojo.Product;
 
@Service
public class ProductService {
	
	@Autowired ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProdcuts();
    }
}
