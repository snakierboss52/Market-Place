package com.market.domain.repository;

import com.market.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getAllPurchase();
    Optional<List<Purchase>> getAllPurchaseByCliente(String cliente);
    Purchase save(Purchase purchase);



}
