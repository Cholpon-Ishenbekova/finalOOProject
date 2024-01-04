package com.example.finalbackend.controller;

import com.example.finalbackend.entity.Record;
import com.example.finalbackend.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/record")
public class RecordController {
    @Autowired
    private RecordService recordService;

    @PostMapping
    public Record saveRecord(@RequestBody Record record){
        return recordService.saveRecord(record);
    }
    @GetMapping
    public List<Record> getAllRecord(){
        return recordService.getAllRecord();
    }

    @GetMapping("/{id}")
    public Optional<Record> getRecordById(@PathVariable int id){
        return recordService.getRecordById(id);
    }

    @PutMapping("/{id}")
    public Record updateRecord(@PathVariable int id, @RequestBody Record record){
        return recordService.updateRecord(id, record);
    }

    @DeleteMapping("/{id}")
    public void deleteRecord(@PathVariable int id){
        recordService.deleteRecord(id);
    }
}
