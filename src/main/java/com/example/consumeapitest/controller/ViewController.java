package com.example.consumeapitest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/view-products")
    public String viewProducts() {
        return "view-products";
    }

    @GetMapping("/add-product")
    public String addProduct() {
        return "add-product";
    }
}
