package com.example.finalbackend.service;

import com.example.finalbackend.entity.Record;

import java.util.List;
import java.util.Optional;

public interface RecordInterface {

    public Record saveRecord(Record record);
    public Optional getRecordById(int id);

    List<Record> getAllRecord();
    Record updateRecord(int id, Record record);
    void deleteRecord(int id);
}
