package com.skillsup.daoInterface.implem;

import com.skillsup.daoInterface.ContactDaoInterface;
import com.skillsup.impl.Contact;
import org.springframework.stereotype.Repository;

/**
 * Created by Валерия on 15.03.2015.
 */
@Repository(value = "contactDAO")
public class ContactDAO implements ContactDaoInterface {

    @Override
    public void addContact(Contact a) {

    }

    @Override
    public void deleteContact(Contact a) {


    }

    @Override
    public void addFriendShip(Contact a, Contact b) {

    }

    @Override
    public void removeFriendShip(Contact a, Contact b) {

    }
}
