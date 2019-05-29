package ru.vertobrat.cashbox.web;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/enabled")
    public List<ItemTo> getAllEnabled() {
        return service.getAllEnabled();
    }

    @PostMapping
    public ItemTo create(@RequestBody ItemTo to) {
        return service.createOrUpdate(to);
    }

    @PutMapping
    public ResponseEntity<ItemTo> update(@RequestBody ItemTo to) {
        return ResponseEntity.ok(service.createOrUpdate(to));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity setEnabled(@PathVariable("id") Long id, @RequestParam("enabled") boolean enabled) {
        service.setEnabled(id, enabled);
        return ResponseEntity.ok().build();
    }
}
