package com.app.app.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageModel {

    private String message;

    public MessageModel(String message) {
        this.message = message;
    }

}
