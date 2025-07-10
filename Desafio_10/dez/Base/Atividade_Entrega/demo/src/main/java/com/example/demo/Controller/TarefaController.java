package com.example.demo.Controller;

import com.example.demo.Dto.TarefaDto;
import com.example.demo.Model.TarefaModel;
import com.example.demo.Repository.TarefaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    TarefaRepository tarefaRepository;

    @PostMapping
    public ResponseEntity<TarefaModel> saveTarefa(@RequestBody @Valid TarefaDto tarefaDto) {
        var tarefaModel = new TarefaModel();
        BeanUtils.copyProperties(tarefaDto, tarefaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(tarefaRepository.save(tarefaModel));
    }

    @GetMapping
    public ResponseEntity<List<TarefaModel>> getAllTarefa(){
        return ResponseEntity.status(HttpStatus.OK).body(tarefaRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object>getOnetarefa(@PathVariable(value="id") int id){
        Optional<TarefaModel> tarefa0 = tarefaRepository.findById(id);
        if(tarefa0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Tarefa não encontrada");
        }
        return ResponseEntity.status(HttpStatus.OK).body(tarefa0.get());
    }

}