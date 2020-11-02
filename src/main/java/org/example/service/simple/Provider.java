package org.example.service.simple;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Provider {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //简单模式
    public void sendHello() {
        rabbitTemplate.convertAndSend("hello", "hello rabbit");
    }

    //工作模式
    public void sendWork() {
        for (int i = 0; i <= 10; i++) {
            rabbitTemplate.convertAndSend("work", "work模型");
        }
    }

    //fanout模型
    public void sendFanout() {
        rabbitTemplate.convertAndSend("logs", "", "fanout_model");
    }

    //路由模式(direct)
    public void sendDirect() {
        rabbitTemplate.convertAndSend("directs", "error", "send info message");
    }

    //路由模式(topic)
    public void sendTopic() {
        rabbitTemplate.convertAndSend("topics", "user.save", "user save topic");
    }

}
