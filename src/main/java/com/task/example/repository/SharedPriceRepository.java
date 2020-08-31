package com.task.example.repository;

import com.task.example.model.SharedPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SharedPriceRepository extends JpaRepository<SharedPrice, Long> {

}
