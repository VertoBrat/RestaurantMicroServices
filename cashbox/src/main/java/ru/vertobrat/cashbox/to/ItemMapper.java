package ru.vertobrat.cashbox.to;

import org.mapstruct.Mapper;
import ru.vertobrat.cashbox.domain.Item;

@Mapper(componentModel = "spring")
public abstract class ItemMapper implements BaseMapper<Item, ItemTo> {
}
