package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart/line-items")
public class LineItemController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void create() {
        //
    }
}
