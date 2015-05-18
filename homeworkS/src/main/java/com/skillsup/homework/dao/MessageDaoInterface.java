package com.skillsup.homework.dao;

import com.skillsup.homework.model.Contact;
import com.skillsup.homework.model.Message;

import java.util.List;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface MessageDaoInterface {
    void storeMessage(Message a);
    List<Message> getConversation(Contact a, Contact b);

}
