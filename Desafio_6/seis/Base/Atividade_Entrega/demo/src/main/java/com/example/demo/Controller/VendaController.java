package com.example.demo.Controller;

import com.example.demo.Dto.RelatorioVendaDto;
import com.example.demo.Model.VendaModel;
import com.example.demo.Repository.VendaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    VendaRepository vendaRepository;

    @PostMapping
    public ResponseEntity<VendaModel> saveVenda(@RequestBody @Valid RelatorioVendaDto relatorioVendaDto) {
        var vendaModel = new VendaModel();
        BeanUtils.copyProperties(relatorioVendaDto, vendaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(vendaRepository.save(vendaModel));
    }

    @GetMapping
    public ResponseEntity<List<VendaModel>> getAllVenda(){
        return ResponseEntity.status(HttpStatus.OK).body(vendaRepository.findAll());
    }

}