package com.example.demo.Controller;

import com.example.demo.Model.ProdutoModel;
import com.example.demo.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ProdutoRepository produtoRepository;



    @GetMapping
    public ResponseEntity<List<ProdutoModel>> getAllProduto(){
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findAll());
    }

}