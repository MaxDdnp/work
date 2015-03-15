package com.skillsup.daoInterface;

import java.util.Set;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface PlaceDaoInterface {
    public void addPlace(Place a);
    public Set<Contact> getAllContactsForPlace(Place a);
}
