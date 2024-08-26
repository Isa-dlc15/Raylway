package com.example.nombreRest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nameController {

    @GetMapping("/mi-nombre")
    public String miNombre(){
        return "Obed Isaías de León Carrillo";
    }
}
