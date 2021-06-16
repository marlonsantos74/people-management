package com.digitalinnovationone.springboot.controller;

import static org.junit.jupiter.api.Assertions.*;

public class HelloControllerTest {
    @GetMapping("/")
    public String  herlloMessage(){
    return "Hello, Digital Innovation One!";
}
}