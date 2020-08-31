package com.task.example.repository;

import com.task.example.model.FilterTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilterRepository extends JpaRepository<FilterTable, String> {

}
