package com.skillsup.daoInterface;

import com.skillsup.impl.Contact;
import com.skillsup.impl.Hobby;

import java.util.Set;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface HobbyDaoInterface {
    void addHobby(Hobby a);
    Set<Contact> getAllContactsWithHobby(Hobby a);
}
