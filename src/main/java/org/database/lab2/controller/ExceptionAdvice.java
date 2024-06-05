package org.database.lab2.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Result ExceptionHandle(Exception e) {
        System.out.println(e.getMessage());
        return new Result(500, null, "error");
    }

    ;
}
