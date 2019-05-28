package ru.vertobrat.cashbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vertobrat.cashbox.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
