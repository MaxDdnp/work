package com.skillsup.service.implem;

import com.skillsup.daoInterface.ContactDaoInterface;
import com.skillsup.daoInterface.HobbyDaoInterface;
import com.skillsup.daoInterface.MessageDaoInterface;
import com.skillsup.daoInterface.PlaceDaoInterface;

import com.skillsup.daoInterface.implem.PlaceDAO;
import com.skillsup.impl.Contact;
import com.skillsup.impl.Hobby;
import com.skillsup.impl.Message;
import com.skillsup.impl.Place;
import com.skillsup.service.JavaContactServiceInterface;
import org.springframework.stereotype.Service;
import sun.text.normalizer.CharTrie;

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
            Contact contact = new Contact(fstName, lstName, date);
            contactDao.addContact(contact);
    }

    @Override
    public void addHobby(String type, String name) {
        Hobby hobby = new Hobby(type, name);
        hobbyDao.addHobby(hobby);
    }

    @Override
    public void addPlace(String title, String description, double longtitude, double latitude) {
        Place place = new Place(title, description, longtitude, latitude);
        placeDao.addPlace(place);
    }

    @Override
    public void addFriendship(Contact a, Contact b) {
        contactDao.addFriendShip(a , b);
    }

    @Override
    public Set<Contact> getFriendList(Contact b) {
        return contactDao.getFriendList(b);
    }

    @Override
    public List<Message> getConversation(Contact a, Contact b) {
        return messageDao.getConversation(a, b);
    }
}
