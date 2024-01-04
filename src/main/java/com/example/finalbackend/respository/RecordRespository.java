package com.example.finalbackend.respository;

import com.example.finalbackend.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRespository extends JpaRepository<Record, Integer> {
}
