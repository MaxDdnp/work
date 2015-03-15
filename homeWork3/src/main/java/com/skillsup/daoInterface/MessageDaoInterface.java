package com.skillsup.daoInterface;

/**
 * Created by Валерия on 15.03.2015.
 */
public interface MessageDaoInterface {
    public void storeMessage(Message a);
    public List<Message> getConversation(Contact a, Contact b);

}
