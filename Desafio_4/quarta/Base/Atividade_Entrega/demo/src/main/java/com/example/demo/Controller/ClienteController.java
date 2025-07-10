package com.example.demo.Controller;

import com.example.demo.Dto.ClienteDto;
import com.example.demo.Model.ClienteModel;
import com.example.demo.Repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
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
    ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<ClienteModel> saveCliente(@RequestBody @Valid ClienteDto clienteDto) {
        var clienteModel = new ClienteModel();
        BeanUtils.copyProperties(clienteDto, clienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clienteModel));
    }

    @GetMapping
    public ResponseEntity<List<ClienteModel>> getAllCliente() {
        return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.findAll());
    }

}