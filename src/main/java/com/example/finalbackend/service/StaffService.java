package com.example.finalbackend.service;

import com.example.finalbackend.entity.Staff;
import com.example.finalbackend.respository.StaffRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService implements StaffServiceInterface{
    @Autowired
    private StaffRespository staffRespository;

    @Override
    public Staff saveStaff(Staff staff) {
        return staffRespository.save(staff);
    }

    @Override
    public Optional<Staff> getStaffByID(int id) {
        return staffRespository.findById(id);
    }

    @Override
    public List<Staff> getAllStaff() {
        return staffRespository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    public Staff updateStaff(int id, Staff staff) {
        Staff staffUpdate = staffRespository.findById(id).orElseThrow();
        staffUpdate.setDepartment(staff.getDepartment());
        staffUpdate.setEmail(staff.getEmail());
        staffUpdate.setFirstName(staff.getFirstName());
        staffUpdate.setLastName(staff.getLastName());
        return staffRespository.save(staffUpdate);
    }

    @Override
    public void deleteStaff(int id) { staffRespository.deleteById(id);}
}
