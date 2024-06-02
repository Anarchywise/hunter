package com.hunter.servicemail.listener;
import com.hunter.servicemail.utils.MailUtil;
import entity.Mail;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


@Service
public class AuthCodeSendListener {

    @Autowired
    MailUtil mailUtil;
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "email"),
            exchange = @Exchange(name = "hunter.direct",type = ExchangeTypes.DIRECT),
            key = {"authCode"}
    ))
    public void authCodeMail(Mail mail){
        mail.setSubject("验证码");
        mailUtil.sendSimpleMail(mail);
    }
}
