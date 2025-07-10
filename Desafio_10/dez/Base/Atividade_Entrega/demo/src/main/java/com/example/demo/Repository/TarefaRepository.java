package com.example.demo.Repository;


import com.example.demo.Model.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaModel, Integer> {
    Optional<TarefaModel> findById(int id);
    Optional<TarefaModel> findAllById(int id);
}
