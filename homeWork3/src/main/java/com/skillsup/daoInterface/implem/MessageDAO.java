package com.skillsup.daoInterface.implem;

import com.skillsup.daoInterface.MessageDaoInterface;
import com.skillsup.impl.Contact;
import com.skillsup.impl.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Валерия on 15.03.2015.
 */
@Repository(value = "messageDAO")
public class MessageDAO implements MessageDaoInterface {

    @Override
    public void storeMessage(Message a) {

    }

    @Override
    public List<Message> getConversation(Contact a, Contact b) {
        return null;
    }
}
