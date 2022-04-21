package com.market.domain.repository;

import com.market.domain.Product;

import javax.swing.text.html.Option;
import java.security.ProtectionDomain;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAllProducts();
    Optional<List<Product>> getProductByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);


}
