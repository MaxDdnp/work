package com.skillsup.homework.dao;

import com.skillsup.homework.model.Contact;
import com.skillsup.homework.model.Place;

import java.util.Set;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface PlaceDaoInterface {
    void addPlace(Place a);
    Set<Contact> getAllContactsForPlace(Place a);
}
