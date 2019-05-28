package ru.vertobrat.cashbox.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vertobrat.cashbox.service.OrderService;
import ru.vertobrat.cashbox.to.OrderTo;

@RestController
@RequestMapping("/api/orders")
@AllArgsConstructor
public class OrderController {

    private OrderService service;

    @PostMapping
    public OrderTo create(@RequestBody OrderTo to) {
        return service.create(to);
    }
}
