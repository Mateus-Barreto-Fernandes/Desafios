package com.example.demo.Controller;

import com.example.demo.Model.ProdutosModel;
import com.example.demo.Repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    ProdutosRepository produtosRepository;


    @GetMapping
    public ResponseEntity<List<ProdutosModel>> getAllProdutos(){
        return ResponseEntity.status(HttpStatus.OK).body(produtosRepository.findAll());
    }

}