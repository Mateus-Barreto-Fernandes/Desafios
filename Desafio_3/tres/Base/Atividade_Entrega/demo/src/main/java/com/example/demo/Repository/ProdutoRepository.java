package com.example.demo.Repository;


import com.example.demo.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    Optional<Produto> findById(int id);
    Optional<Produto> findAllById(int id);

    public interface produtoRepository extends JpaRepository<Produto, Long> {
    }
}


