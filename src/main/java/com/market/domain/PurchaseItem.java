package com.market.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public class PurchaseItem {

    private int productId;
    private int quantity;
    private double total;
    private boolean active;

}
