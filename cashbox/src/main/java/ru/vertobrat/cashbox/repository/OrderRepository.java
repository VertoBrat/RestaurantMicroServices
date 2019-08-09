package ru.vertobrat.cashbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.vertobrat.cashbox.domain.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("select o from Order o where o.enable = true")
    List<Order> getAllEnabled();
}
