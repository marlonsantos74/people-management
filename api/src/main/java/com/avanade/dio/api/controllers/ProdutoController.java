package com.avanade.dio.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController{

    @GuetMapping
    public String listar{
        return "Lista de Produtos";
    }
}