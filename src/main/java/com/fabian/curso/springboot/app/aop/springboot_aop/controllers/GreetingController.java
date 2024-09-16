package com.fabian.curso.springboot.app.aop.springboot_aop.controllers;

import com.fabian.curso.springboot.app.aop.springboot_aop.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greeting;

    @GetMapping("/greeting")
    public ResponseEntity<?> greeting() {

        return ResponseEntity.ok(Collections.singletonMap("greeting", greeting.sayHello("Pepe", "Hola cómo estas")));
    }

    @GetMapping("/greeting-error")
    public ResponseEntity<?> greetingError() {

        return ResponseEntity.ok(Collections.singletonMap("greeting", greeting.sayHelloError("Pepe", "Hola cómo estas")));
    }
}
