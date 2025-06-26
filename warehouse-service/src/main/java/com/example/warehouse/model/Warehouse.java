package com.example.warehouse.model;

public record Warehouse(
        String orderId,
        String product,
        Integer quantity
) { }