package com.example.jacksondatetimeexample.controller;

import com.example.jacksondatetimeexample.model.Event;
import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EventController {


    // 역직렬화
    @GetMapping("/event")
    public ResponseEntity<String> getParam(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime currentDate) {
        log.info("currentDate = {} ", currentDate);
        return ResponseEntity.ok("SUCCESS");
    }

    // 역직렬화
    @PostMapping("/event")
    public ResponseEntity<String> createEvent(@RequestBody Event event) {
        log.info("event = {} ", event);
        return ResponseEntity.ok("SUCCESS");
    }

    // 직렬화
    @GetMapping("/")
    public Event getEvent() {
        return new Event("event", LocalDateTime.now());
    }
}
