package com.example.order.model;
public record Order(
        String orderId,
        String product,
        Integer quantity
) {}