package ru.vertobrat.cashbox.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "operator")
    private String operator;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "items_orders",
                joinColumns = @JoinColumn(name = "order_id"),
                inverseJoinColumns = @JoinColumn(name = "item_id",
                                                nullable = false))
    private Collection<Item> items = new ArrayList<>();


}
