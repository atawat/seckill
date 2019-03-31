package org.ms.order.web;

import java.util.List;
import org.ms.order.domain.Order;
import org.ms.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Zhenglai Zhang
 * @create: 2019-03-31 12:51
 **/
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order create(Order order) {
        return orderService.create(order);
    }

    @GetMapping
    public List<Order> getAll() {
        return orderService.findAll();
    }

}