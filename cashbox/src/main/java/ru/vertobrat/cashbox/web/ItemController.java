package ru.vertobrat.cashbox.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.vertobrat.cashbox.service.ItemService;
import ru.vertobrat.cashbox.to.ItemTo;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@AllArgsConstructor
public class ItemController {

    private ItemService service;

    @GetMapping
    public List<ItemTo> getAll() {
        return service.getAll();
    }
}
