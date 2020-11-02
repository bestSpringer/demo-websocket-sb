package org.example.service.simple;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FanoutCustomer {

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,//创建临时队列（不写队列名称）
                    exchange = @Exchange(value = "logs", type = "fanout") //绑定交换机
            )
    })
    public void receivel1(String message) {
        System.out.println("message1 = " + message);
    }

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,//创建临时队列（不写队列名称）
                    exchange = @Exchange(value = "logs", type = "fanout") //绑定交换机
            )
    })
    public void receivel2(String message) {
        System.out.println("message2 = " + message);
    }
}
