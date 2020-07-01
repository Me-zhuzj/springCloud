package com.cn.feignView.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cn.feignView.pojo.Product;

@FeignClient(value = "HELPBUY-DATASERVICE")
public interface ProductClientFeign {

	@GetMapping("/products")
    public List<Product> listProdcuts();

}
