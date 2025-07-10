package com.example.demo.Repository;


import com.example.demo.Model.VendaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VendaRepository extends JpaRepository<VendaModel, Integer> {
    Optional<VendaModel> findById(int id);
    Optional<VendaModel> findAllById(int id);
}
