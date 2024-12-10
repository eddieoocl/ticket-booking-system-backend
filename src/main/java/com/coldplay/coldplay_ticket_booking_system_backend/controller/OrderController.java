package com.coldplay.coldplay_ticket_booking_system_backend.controller;

import com.coldplay.coldplay_ticket_booking_system_backend.dto.order.OrderRequest;
import com.coldplay.coldplay_ticket_booking_system_backend.dto.order.OrderResponse;
import com.coldplay.coldplay_ticket_booking_system_backend.model.Order;
import com.coldplay.coldplay_ticket_booking_system_backend.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest orderRequest) {
        Order order = orderService.createOrder(orderRequest);
        return ResponseEntity.ok(order);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderResponse> getOrderById(@PathVariable Integer orderId) {
        OrderResponse orderResponse = orderService.getOrderResponseById(orderId);
        return ResponseEntity.ok(orderResponse);
    }
}