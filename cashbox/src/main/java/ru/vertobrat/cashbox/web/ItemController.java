package ru.vertobrat.cashbox.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vertobrat.cashbox.repository.ItemRepository;
import ru.vertobrat.cashbox.to.ItemMapper;
import ru.vertobrat.cashbox.to.ItemTo;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@AllArgsConstructor
public class ItemController {

    private ItemRepository repository;
    private ItemMapper mapper;

    @GetMapping
    public List<ItemTo> getAll() {
        return mapper.toToList(repository.findAll());
    }
}
