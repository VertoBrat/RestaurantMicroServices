package ru.vertobrat.cashbox.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vertobrat.cashbox.domain.Order;
import ru.vertobrat.cashbox.repository.OrderRepository;
import ru.vertobrat.cashbox.to.OrderMapper;
import ru.vertobrat.cashbox.to.OrderTo;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class OrderService {

    private OrderRepository repository;
    private OrderMapper mapper;

    @Transactional
    public OrderTo create(OrderTo to) {
        Order order = mapper.toEntity(to);
        OrderTo orderTo = mapper.toTo(repository.save(order));
        return orderTo;
    }
}
