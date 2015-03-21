package com.skillsup.daoInterface;

import com.skillsup.impl.Contact;

import java.util.Set;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface ContactDaoInterface {
    void addContact(Contact a);
    void deleteContact(Contact a);
    void addFriendShip(Contact a, Contact b);
    void removeFriendShip(Contact a, Contact b);
    Set<Contact> getFriendList(Contact b);

}
