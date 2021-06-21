package com.order;

import lombok.Builder;
import lombok.Data;

@Data
public class Order {

    private Long id;
    private String code;
    private String productName;
    private String cost;

    @Builder
    public Order(Long id, String code, String productName, String cost) {
        this.id = id;
        this.code = code;
        this.productName = productName;
        this.cost = cost;
    }
}
