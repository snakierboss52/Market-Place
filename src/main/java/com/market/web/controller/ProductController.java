package com.market.web.controller;


import com.market.domain.Product;
import com.market.domain.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") int productId){
        return productService.getProduct(productId);
    }

    @GetMapping("/category/{id}")
    public Optional<List<Product>> getProductByCategory(@PathVariable("id") int categoryId){
        return productService.getProductByCategory(categoryId);
    }

    @PostMapping()
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") int productId){
        return getProduct(productId).map(product -> {
            productService.delete(productId);
            return true;
        }).orElse(false);
    }

}
