package ru.vertobrat.cashbox.to;

import org.mapstruct.Mapper;
import ru.vertobrat.cashbox.domain.Order;

@Mapper(componentModel = "spring")
public abstract class OrderMapper implements BaseMapper<Order, OrderTo> {
}
