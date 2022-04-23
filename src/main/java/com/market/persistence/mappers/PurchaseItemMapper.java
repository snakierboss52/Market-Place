package com.market.persistence.mappers;


import com.market.domain.Purchase;
import com.market.domain.PurchaseItem;
import com.market.persistence.entities.CompraProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {


    @Mapping(source = "id.idProducto", target = "productId")
    @Mapping(source = "cantidad", target = "quantity")
    @Mapping(source = "total",target = "active")
    PurchaseItem toPurchaseItem(CompraProducto compraProducto);


    @InheritInverseConfiguration
    @Mapping(target = "compra", ignore = true)
    @Mapping(target = "producto", ignore = true)
    @Mapping(target = "id.idCompra", ignore = true)
    CompraProducto toCompraProducto(PurchaseItem purchaseItem);

}
