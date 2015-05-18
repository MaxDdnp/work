package com.skillsup.homework.service.implem;

import com.skillsup.homework.dao.ContactDaoInterface;
import com.skillsup.homework.dao.HobbyDaoInterface;
import com.skillsup.homework.dao.MessageDaoInterface;
import com.skillsup.homework.dao.PlaceDaoInterface;

import com.skillsup.homework.dao.implem.PlaceDAO;
import com.skillsup.homework.model.Contact;
import com.skillsup.homework.model.Hobby;
import com.skillsup.homework.model.Message;
import com.skillsup.homework.model.Place;
import com.skillsup.homework.service.JavaContactServiceInterface;
import org.springframework.stereotype.Service;
import sun.text.normalizer.CharTrie;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

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
