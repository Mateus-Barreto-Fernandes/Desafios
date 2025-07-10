package com.example.demo.Controller;

import com.example.demo.Model.PecasModel;
import com.example.demo.Repository.PecasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pecas")
public class PecasController {

    @Autowired
    private PecasRepository pecasRepository;

    @PostMapping
    public PecasModel criarPeca(@RequestBody PecasModel peca) {
        peca.setId(System.currentTimeMillis());
        return pecasRepository.save(peca);
    }

    @GetMapping
    public List<PecasModel> listarPecas() {
        return pecasRepository.findAll();
    }
}
