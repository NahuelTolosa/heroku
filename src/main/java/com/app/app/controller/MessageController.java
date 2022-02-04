package com.app.app.controller;

import com.app.app.model.MessageModel;
import com.app.app.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @GetMapping("/all")
    public List<MessageModel> findAll () {
        return this.messageService.findAll();
    }

    @GetMapping("/message")
    public MessageModel findByName (@RequestParam String name) {
        return this.messageService.findByName(name);
    }

    @PostMapping
    public MessageModel save (@RequestBody MessageModel m) {
        return this.messageService.save(m);
    }
}
