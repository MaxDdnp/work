package com.skillsup.daoInterface;

import com.skillsup.impl.Contact;
import com.skillsup.impl.Message;

import java.util.List;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface MessageDaoInterface {
    void storeMessage(Message a);
    List<Message> getConversation(Contact a, Contact b);

}
