package com.skillsup.homework.dao;

import com.skillsup.homework.model.Contact;
import com.skillsup.homework.model.Hobby;

import java.util.Set;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface HobbyDaoInterface {
    void addHobby(Hobby a);
    Set<Contact> getAllContactsWithHobby(Hobby a);
}
