package com.skillsup.daoInterface;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface HobbyDaoInterface {
    public void addHobby(Hobby a);
    public Set<Contact> getAllContactsWithHobby(Hobby a);
}
