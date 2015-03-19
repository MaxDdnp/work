package com.skillsup.daoInterface.implem;

import com.skillsup.daoInterface.HobbyDaoInterface;
import com.skillsup.impl.Contact;
import com.skillsup.impl.Hobby;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by Валерия on 15.03.2015.
 */
@Repository(value = "hobbyDAO")
public class HobbyDAO implements HobbyDaoInterface {

    @Override
    public void addHobby(Hobby a) {

    }

    @Override
    public Set<Contact> getAllContactsWithHobby(Hobby a) {
        return null;
    }
}
