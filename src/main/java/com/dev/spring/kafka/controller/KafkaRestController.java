package com.dev.spring.kafka.controller;

import com.dev.spring.kafka.message.repository.MessageRepository;
import com.dev.spring.kafka.sender.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaRestController {
    @Autowired
    private MessageProducer producer;

    @Autowired
    private MessageRepository messageRepo;

    //Send message to kafka
    @GetMapping("/send")
    public String sendMsg(
            @RequestParam("msg") String message) {
        producer.sendMessage(message);
        return " " +message +    " sent successfully!";
    }

    @GetMapping("/hello")
    public String pv(){
        return "Priyavrat";
    }

    //Read all messages
    @GetMapping("/getAll")
    public String getAllMessages() {
        return messageRepo.getAllMessages() ;
    }
}
