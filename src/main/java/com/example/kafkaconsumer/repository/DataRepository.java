package com.example.kafkaconsumer.repository;

import com.example.kafkaconsumer.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
