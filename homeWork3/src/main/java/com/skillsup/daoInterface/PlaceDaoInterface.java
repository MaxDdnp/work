package com.skillsup.daoInterface;

import com.skillsup.impl.Contact;
import com.skillsup.impl.Place;

import java.util.Set;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface PlaceDaoInterface {
    void addPlace(Place a);
    Set<Contact> getAllContactsForPlace(Place a);
}
