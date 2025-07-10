package com.example.demo.Repository;


import com.example.demo.Model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Integer> {
    Optional<ProdutosModel> findById(int id);
    Optional<ProdutosModel> findAllById(int id);
}
