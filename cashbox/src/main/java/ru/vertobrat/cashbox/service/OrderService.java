package ru.vertobrat.cashbox.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vertobrat.cashbox.domain.Order;
import ru.vertobrat.cashbox.exception.NoFoundException;
import ru.vertobrat.cashbox.repository.OrderRepository;
import ru.vertobrat.cashbox.to.OrderMapper;
import ru.vertobrat.cashbox.to.OrderTo;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class OrderService {

    private OrderRepository repository;
    private OrderMapper mapper;

    @Transactional
    public OrderTo create(OrderTo to) {
        Order order = mapper.toEntity(to);
        return mapper.toTo(repository.save(order));
    }

    public List<OrderTo> getAll() {
        List<Order> orders = repository.findAll();
        return mapper.toToList(orders);
    }

    public OrderTo getById(Long id) {
        return mapper.toTo(repository.findById(id).orElseThrow(NoFoundException::new));
    }
}
