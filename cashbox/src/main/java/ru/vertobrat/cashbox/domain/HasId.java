package ru.vertobrat.cashbox.domain;


import org.springframework.util.Assert;

public interface HasId extends Comparable<HasId> {

    Long getId();

    void setId(Long id);

    default long id() {
        Assert.notNull(getId(), "Entity " + this + "must have id");
        return getId();
    }

    @Override
    default int compareTo(HasId o) {
        return Long.compare(id(), o.id());
    }
}
