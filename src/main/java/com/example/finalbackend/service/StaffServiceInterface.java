package com.example.finalbackend.service;

import com.example.finalbackend.entity.Staff;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Optional;

public interface StaffServiceInterface {
    public Staff saveStaff(Staff staff);
    public Optional<Staff> getStaffByID(int id);
    List<Staff> getAllStaff();
    Staff updateStaff(int id, Staff staff);
    void deleteStaff(int id);

}
