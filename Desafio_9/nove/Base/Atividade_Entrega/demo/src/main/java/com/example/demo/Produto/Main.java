package com.example.demo.Produto;

import com.example.demo.Produto.Produto;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) { //de o play nesta parte do código//
        try {
            Produto produto = new Produto(1L, "Teclado Gamer", 199.90);


            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(produto);


            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
