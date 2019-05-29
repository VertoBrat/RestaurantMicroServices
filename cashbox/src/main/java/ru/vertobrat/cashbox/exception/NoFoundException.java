package ru.vertobrat.cashbox.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class NoFoundException extends ResponseStatusException {

    public NoFoundException() {
        super(HttpStatus.NOT_FOUND, "No Entity with this id");
    }
}
