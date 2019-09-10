package com.project.posque.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.posque.entity.Product;
import com.project.posque.repository.ProductJpaRepository;

@RestController
public class ProductRegistrationRestController {
	
	@Autowired
	private ProductJpaRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	@GetMapping("/products/{pcode}")
	public Product getAllProducts(@PathVariable int pcode) {
		Optional<Product> product = productRepository.findById(pcode);
		return product.get();
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> insertProduct(@RequestBody Product product) {
		Product newProduct = productRepository.save(product);
		return ResponseEntity.ok(newProduct);
				
	}
	
}
