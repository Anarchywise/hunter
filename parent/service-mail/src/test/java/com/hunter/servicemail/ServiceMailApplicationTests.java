package com.hunter.servicemail;

import entity.Mail;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceMailApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    void sendMessage() {
        // 准备消息
        Mail mail = new Mail();
        mail.setContent("test");
        mail.setSubject("test");
        mail.setRecipient("zh1981053231@163.com");
        // 发送消息
        rabbitTemplate.convertAndSend("hunter.direct","authCode",mail);
    }

}
