package com.example.finalbackend.controller;

import com.example.finalbackend.entity.Staff;
import com.example.finalbackend.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @PostMapping
    public Staff saveStaff(@RequestBody Staff staff){
        return staffService.saveStaff(staff);
    }
    @GetMapping
    public List<Staff> getAllStaff(){
        return staffService.getAllStaff();
    }
    @GetMapping("/{id}")
    public Optional<Staff> getStaffByID(@PathVariable int id){
        return staffService.getStaffByID(id);
    }
    @PutMapping("/{id}")
    public Staff updateStaff(@PathVariable int id, @RequestBody Staff staff){
        return staffService.updateStaff(id, staff);
    }
    @DeleteMapping("/{id}")
    public void deleteStaff(@PathVariable int id){
        staffService.deleteStaff(id);
    }
}
