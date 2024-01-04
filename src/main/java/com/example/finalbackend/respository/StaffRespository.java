package com.example.finalbackend.respository;

import com.example.finalbackend.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StaffRespository extends JpaRepository<Staff, Integer> {

}
