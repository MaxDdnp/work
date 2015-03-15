package com.skillsup.daoInterface;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface ContactDaoInterface {
    public void addContact(Contact a);
    public void deleteContact(Contact a);
    public void addFriendShip(Contact a, Contact b);
    public void removeFriendShip(Contact a, Contact b);

}
