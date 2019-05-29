package ru.vertobrat.cashbox.to;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
public class OrderTo {

    private Long id;
    @NotNull
    @NotBlank
    private String operator;
    @NotNull
    private Collection<ItemTo> items;
}
