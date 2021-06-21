package com.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/order")
public class OrderAPI {

    @GetMapping(value = "/item")
    public Order getOrder(){
        return Order.builder()
                        .id(0001L)
                        .code("ABCDE")
                        .productName("Labtop")
                        .cost("200$")
                        .build();
    }

}
