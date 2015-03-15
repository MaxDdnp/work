package com.skillsup.service;


import java.util.List;
import java.util.Set;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface JavaContactServiceInterface {

    public void createContact(String fstName, String lstName, LocalDate);
    public void addHobby(String type, String name);
    public void addPlace(String title, String description, double longtitude, double latitude);
    public void addFriendship(Contact a, Contact b);
    public Set<Contact> getFriendList(Contact b);
    public List<Message> getConversation(Contact a, Contact b);


}
