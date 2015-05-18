package com.skillsup.homework.service;


import com.skillsup.homework.model.Contact;
import com.skillsup.homework.model.Message;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface JavaContactServiceInterface {

    public void createContact(String fstName, String lstName, LocalDate date);
    public void addHobby(String type, String name);
    public void addPlace(String title, String description, double longtitude, double latitude);
    public void addFriendship(Contact a, Contact b);
    public Set<Contact> getFriendList(Contact b);
    public List<Message> getConversation(Contact a, Contact b);


}
