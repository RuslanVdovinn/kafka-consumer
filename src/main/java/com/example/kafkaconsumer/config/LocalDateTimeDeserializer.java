package com.example.kafkaconsumer.config;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.time.LocalDateTime;

@Component
public class LocalDateTimeDeserializer implements JsonDeserializer<LocalDateTime> {

    @Override
    public LocalDateTime deserialize(
            JsonElement json,
            Type type,
            JsonDeserializationContext jsonDeserializationContext) {
        JsonArray jsonElements = json.getAsJsonArray();
        int year = jsonElements.get(0).getAsInt();
        int month = jsonElements.get(1).getAsInt();
        int day = jsonElements.get(2).getAsInt();
        int hour = jsonElements.get(3).getAsInt();
        int minute = jsonElements.get(4).getAsInt();
        int second = jsonElements.get(5).getAsInt();
        return LocalDateTime.of(year, month, day, hour, minute, second);
    }
}
