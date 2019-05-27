package ru.vertobrat.cashbox.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vertobrat.cashbox.repository.ItemRepository;
import ru.vertobrat.cashbox.to.ItemMapper;
import ru.vertobrat.cashbox.to.ItemTo;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class ItemService {

    private ItemRepository repository;
    private ItemMapper mapper;

    public List<ItemTo> getAll() {
        return mapper.toToList(repository.findAll());
    }
}
