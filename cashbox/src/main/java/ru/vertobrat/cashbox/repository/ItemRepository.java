package ru.vertobrat.cashbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.vertobrat.cashbox.domain.Item;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Modifying
    @Query(value = "update Item i set i.enable=:enabled where i.id=:id")
    void setEnabled(boolean enabled, long id);

    @Query("select i from Item i where i.enable = true")
    List<Item> getAllEnabled();
}
