package ru.vertobrat.cashbox.to;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
public class OrderTo {

    private Long id;
    private String operator;
    private Collection<ItemTo> items;
}
