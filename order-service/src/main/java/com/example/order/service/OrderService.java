package com.example.order.service;

import com.example.order.model.Order;
import com.example.order.producer.OrderKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private static final Logger log = LoggerFactory.getLogger(OrderService.class);
    private final OrderKafkaProducer orderKafkaProducer;
    public OrderService(OrderKafkaProducer orderKafkaProducer) {
        this.orderKafkaProducer = orderKafkaProducer;
    }
    public void saveOrder(Order order) {
        orderKafkaProducer.sendOrderToKafka(order);
        log.info("Order successfully saved: id={}", order.orderId());
    }
}
