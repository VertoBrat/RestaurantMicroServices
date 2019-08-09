package ru.vertobrat.cashbox.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "items")
public class Item extends BaseEntity{

    private String name;

    private Double price;

    private boolean enable;
}
