package ru.vertobrat.cashbox.to;

import java.util.Collection;
import java.util.List;

public interface BaseMapper<E, T> {

    T toTo(E entity);

    List<T> toToList(Collection<E> entities);

    E toEntity(T to);

    List<E> toEntityList(Collection<T> tos);
}
