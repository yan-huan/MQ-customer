package com.springboot.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;


@SpringBootApplication
@EnableBinding({Processor.class})
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }


    @StreamListener(Processor.INPUT)
    public void input1(Message<String> message) {
        System.out.println("接收消息" + message.getPayload());
    }


}




