package com.app.app.repository;

import com.app.app.db.Database;
import com.app.app.model.MessageModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessageRepository {

    private Database database = new Database();

    public List<MessageModel> findAll() {
        return this.database.getMessages();
    }

    public MessageModel findByName(String name) {
        for (MessageModel m: this.database.getMessages()) {
            if(m.getMessage().equals(name)){
                return m;
            }
        }
        return null;
    }

    public Boolean save(MessageModel m) {
        return this.database.save(m);
    }
}
