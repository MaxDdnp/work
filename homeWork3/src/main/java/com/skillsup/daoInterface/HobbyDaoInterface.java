package com.skillsup.daoInterface;

import com.skillsup.impl.Contact;
import com.skillsup.impl.Hobby;

import java.util.Set;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface HobbyDaoInterface {
    public void addHobby(Hobby a);
    public Set<Contact> getAllContactsWithHobby(Hobby a);
}
