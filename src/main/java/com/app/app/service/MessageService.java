package com.app.app.service;

import com.app.app.model.MessageModel;
import com.app.app.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;

    public List<MessageModel> findAll () {
        return this.messageRepository.findAll();
    }

    public MessageModel findByName (String name) {
        return this.messageRepository.findByName(name);
    }

    public MessageModel save (MessageModel m) {
        if(this.messageRepository.save(new MessageModel(m.getMessage())))
            return m;
        return null;
    }

}
