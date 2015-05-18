package com.skillsup.homework.dao.implem;

import com.skillsup.homework.dao.PlaceDaoInterface;
import com.skillsup.homework.model.Contact;
import com.skillsup.homework.model.Place;
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
