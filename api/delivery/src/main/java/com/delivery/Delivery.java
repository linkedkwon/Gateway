package com.delivery;

import lombok.Builder;
import lombok.Data;

@Data
public class Delivery {

    private Long id;
    private String code;
    private String deliverName;
    private String address;

    @Builder
    public Delivery(Long id, String code, String deliverName, String address) {
        this.id = id;
        this.code = code;
        this.deliverName = deliverName;
        this.address = address;
    }
}
