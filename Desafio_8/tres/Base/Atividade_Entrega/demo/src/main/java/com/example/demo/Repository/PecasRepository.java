package com.example.demo.Repository;


import com.example.demo.Model.PecasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PecasRepository extends JpaRepository<PecasModel, Integer> {
    Optional<PecasModel> findById(int id);
    Optional<PecasModel> findAllById(int id);
}
