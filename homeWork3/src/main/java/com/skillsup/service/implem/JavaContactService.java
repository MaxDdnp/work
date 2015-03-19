package com.skillsup.service.implem;

import com.skillsup.daoInterface.ContactDaoInterface;
import com.skillsup.daoInterface.HobbyDaoInterface;
import com.skillsup.daoInterface.MessageDaoInterface;
import com.skillsup.daoInterface.PlaceDaoInterface;

import com.skillsup.impl.Contact;
import com.skillsup.impl.Message;
import com.skillsup.service.JavaContactServiceInterface;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by Валерия on 15.03.2015.
 */
@Service(value = "contactService")
public class JavaContactService implements JavaContactServiceInterface {
    @Resource(name = "contactDAO")
    private ContactDaoInterface contactDao;
    @Resource(name = "hobbyDAO")
    private HobbyDaoInterface hobbyDao;
    @Resource(name = "placeDAO")
    private PlaceDaoInterface placeDao;
    @Resource(name = "messageDAO")
    private MessageDaoInterface messageDao;


    @Override
    public void createContact(String fstName, String lstName, LocalDate date) {

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
    public Set<Contact> getFriendList(Contact b) {
        return null;
    }

    @Override
    public List<Message> getConversation(Contact a, Contact b) {
        return null;
    }
}
