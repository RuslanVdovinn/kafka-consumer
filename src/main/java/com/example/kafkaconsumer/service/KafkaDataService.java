package com.example.kafkaconsumer.service;

import com.example.kafkaconsumer.model.Data;

public interface KafkaDataService {

    void handle(Data data);
}
