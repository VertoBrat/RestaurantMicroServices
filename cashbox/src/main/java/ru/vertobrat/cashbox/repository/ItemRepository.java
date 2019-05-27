package ru.vertobrat.cashbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vertobrat.cashbox.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
