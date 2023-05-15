package com.gairola.userservice.controller;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.gairola.userservice.model.Product;
import com.gairola.userservice.service.ProductService;
 
@RestController
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
 
    @Autowired
    private ProductService service;
     
    @GetMapping("/products")
public List<Product> list() {
    	logger.info("this is a info message");
        logger.warn("this is a warn message");
        logger.error("this is a error message");
    return service.listAll();
}
@GetMapping("/products/{id}")
public ResponseEntity<Product> get(@PathVariable Integer id) {
	
    try {
        Product product = service.get(id);
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    } catch (NoSuchElementException e) {
        return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
    }      
}
}