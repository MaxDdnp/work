package com.skillsup.daoInterface.implem;

import com.skillsup.daoInterface.MessageDaoInterface;

/**
 * Created by Валерия on 15.03.2015.
 */
public class Message implements MessageDaoInterface {

    @Override
    public void storeMessage(Message a) {

    }

    @Override
    public List<Message> getConversation(Contact a, Contact b) {
        return null;
    }
}
