package com.skillsup.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Валерия on 17.03.2015.
 */
public class Message {
    private LocalDateTime date;
    private Contact from;
    private Contact to;
    private String content;


    public Message() {
    }

    public Message(LocalDateTime date, Contact from, Contact to, String content) {
        this.date = date;
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Contact getFrom() {
        return from;
    }

    public void setFrom(Contact from) {
        this.from = from;
    }

    public Contact getTo() {
        return to;
    }

    public void setTo(Contact to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
