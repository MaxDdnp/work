package com.skillsup.daoInterface.implem;

import com.skillsup.daoInterface.PlaceDaoInterface;
import com.skillsup.impl.Contact;
import com.skillsup.impl.Place;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by Валерия on 15.03.2015.
 */
@Repository(value = "placeDAO")
public class PlaceDAO implements PlaceDaoInterface {

    @Override
    public void addPlace(Place a) {

    }

    @Override
    public Set<Contact> getAllContactsForPlace(Place a) {
        return null;
    }
}
