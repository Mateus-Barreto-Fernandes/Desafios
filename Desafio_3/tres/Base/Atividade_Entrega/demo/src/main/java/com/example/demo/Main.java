package com.example.demo;

import com.example.demo.Model.Produto;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        try {
            Produto produto = new Produto(1L, "Notebook", 3500.00);
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(produto);
            System.out.println(json); // Simula envio pela rede
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
