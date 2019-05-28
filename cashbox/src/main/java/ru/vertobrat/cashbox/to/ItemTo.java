package ru.vertobrat.cashbox.to;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ItemTo {

    private Long id;
    private String name;
    private Double price;
}
