package com.app.app.db;

import com.app.app.model.MessageModel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Database {

    private List<MessageModel> messages = new ArrayList<>();

    public Database() {
        messages.add(new MessageModel("Mensaje01"));
        messages.add(new MessageModel("Mensaje02"));
        messages.add(new MessageModel("Mensaje03"));
        messages.add(new MessageModel("Mensaje04"));
        messages.add(new MessageModel("Mensaje05"));
    }

    public Boolean save(MessageModel m) {
        return this.messages.add(m);
    }
}
