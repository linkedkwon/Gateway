package com.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/delivery")
public class DeliveryAPI {

    @GetMapping(value = "/list")
    public Delivery getDelivery(){
        return Delivery.builder()
                .id(0001L)
                .code("ABCDE")
                .deliverName("Laptop")
                .address("SeongNamSi-Bundanggu")
                .build();
    }
}
