package com.skillsup.service.implem;

import com.skillsup.daoInterface.ContactDaoInterface;
import com.skillsup.daoInterface.HobbyDaoInterface;
import com.skillsup.daoInterface.MessageDaoInterface;
import com.skillsup.daoInterface.PlaceDaoInterface;
import com.skillsup.daoInterface.implem.Contact;
import com.skillsup.service.JavaContactServiceInterface;

import java.util.List;
import java.util.Set;

/**
 * Created by Валерия on 15.03.2015.
 */
public class JavaContactService implements JavaContactServiceInterface {
    private ContactDaoInterface contactDao;
    private HobbyDaoInterface hobbyDao;
    private PlaceDaoInterface placeDao;
    private MessageDaoInterface messageDao;

    @Override
    public void createContact(String fstName, String lstName) {

    }

    @Override
    public void addHobby(String type, String name) {

    }

    @Override
    public void addPlace(String title, String description, double longtitude, double latitude) {

    }

    @Override
    public void addFriendship(Contact a, Contact b) {

    }

    @Override
    public Set<Contact> getFriendList(Contact x) {
        return null;
    }

    @Override
    public List<Message> getConversation(Contact a, Contact b) {
        return null;
    }
}
