package com.skillsup.homework.dao.implem;

import com.skillsup.homework.dao.HobbyDaoInterface;
import com.skillsup.homework.model.Contact;
import com.skillsup.homework.model.Hobby;
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
