package ru.vertobrat.cashbox.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order extends BaseEntity {

    @Column(name = "operator")
    private String operator;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "items_orders",
                joinColumns = @JoinColumn(name = "order_id"),
                inverseJoinColumns = @JoinColumn(name = "item_id",
                                                nullable = false))
    @NotNull
    private Collection<Item> items = new ArrayList<>();


}
