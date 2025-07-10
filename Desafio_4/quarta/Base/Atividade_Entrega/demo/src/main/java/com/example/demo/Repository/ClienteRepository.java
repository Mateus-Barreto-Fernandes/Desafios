package com.example.demo.Repository;


import com.example.demo.Model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {
    Optional<ClienteModel> findById(int id);
    Optional<ClienteModel> findAllById(int id);
}
