package com.example.finalbackend.service;

import com.example.finalbackend.entity.Record;
import com.example.finalbackend.respository.RecordRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecordService implements RecordInterface {
    @Autowired
    private RecordRespository recordRespository;

    @Override
    public Record saveRecord(Record record) {
        return recordRespository.save(record);
    }

    @Override
    public Optional getRecordById(int id) {
        return recordRespository.findById(id);
    }

    @Override
    public List<Record> getAllRecord() {
        return recordRespository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    public Record updateRecord(int id, Record record) {
        Record recordUpdate = recordRespository.findById(id).orElseThrow();
        recordUpdate.setFirstName(record.getFirstName());
        recordUpdate.setLastName(record.getLastName());
        recordUpdate.setStatus(record.getStatus());
        recordUpdate.setDayTime(record.getDayTime());
        return recordRespository.save(recordUpdate);
    }

    @Override
    public void deleteRecord(int id) {
        recordRespository.deleteById(id);
    }
}
