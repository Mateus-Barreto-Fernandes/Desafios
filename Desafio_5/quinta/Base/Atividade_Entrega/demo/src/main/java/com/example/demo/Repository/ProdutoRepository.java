package com.example.demo.Repository;


import com.example.demo.Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {
    Optional<ProdutoModel> findById(int id);
    Optional<ProdutoModel> findAllById(int id);
}
