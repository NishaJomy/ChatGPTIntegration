package org.launchcode.ChatGPTIntegration.model;

import java.util.ArrayList;
import java.util.List;

public class ChatGptRequest {
    private String model;
    private List<Message> messages= new ArrayList<>();

    public ChatGptRequest(String model, String prompt) {
        this.model = model;
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user",prompt));
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public ChatGptRequest(String model, List<Message> messages) {
        this.model = model;
        this.messages = messages;
    }

    public ChatGptRequest() {
    }

}
