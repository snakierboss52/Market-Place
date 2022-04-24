package com.market.persistence;

import com.market.domain.Purchase;
import com.market.domain.repository.PurchaseRepository;
import com.market.persistence.crud.CompraCrudRepository;
import com.market.persistence.entities.Compra;
import com.market.persistence.mappers.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {

    @Autowired
    private CompraCrudRepository compraCrudRepository;

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public List<Purchase> getAllPurchase() {
        return purchaseMapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getAllPurchaseByCliente(String cliente) {
        return compraCrudRepository.findByIdCliente(cliente).
                map(compras -> purchaseMapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = purchaseMapper.toCompra(purchase);
        compra.getProductos().forEach(compraProducto -> compraProducto.setCompra(compra));
        return purchaseMapper.toPurchase(compraCrudRepository.save(compra));
    }
}
