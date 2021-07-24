package com.example.jacksondatetimeexample.model;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Event {

    private String name;
    private LocalDateTime eventDate;

    // default생서자 필수 deserialzie
    public Event() {
    }


    public Event(String name, LocalDateTime eventDate) {
        this.name = name;
        this.eventDate = eventDate;
    }
}
