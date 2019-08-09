package ru.vertobrat.cashbox.web;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ru.vertobrat.cashbox.service.OrderService;
import ru.vertobrat.cashbox.to.OrderTo;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/orders")
@AllArgsConstructor
public class OrderController {

    private OrderService service;

    @GetMapping
    public List<OrderTo> getAll() {
        return service.getAll();
    }

    @GetMapping("/enabled")
    public List<OrderTo> getAllEnabled() {
        return service.getAllEnabled();
    }

    @GetMapping("/{id}")
    public OrderTo getById(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @PostMapping
    public OrderTo create(@RequestBody @Valid OrderTo to, BindingResult result) {
        if (result.hasErrors())
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Some property is wrong");
        return service.create(to);
    }
}
