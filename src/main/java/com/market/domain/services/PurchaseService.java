package com.market.domain.services;

import com.market.domain.Purchase;
import com.market.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAllPurchase() {
        return purchaseRepository.getAllPurchase();
    }

    public Optional<List<Purchase>> getAllPurchaseByCliente(String clientId) {
        return purchaseRepository.getAllPurchaseByCliente(clientId);
    }

    public Purchase save(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

}
