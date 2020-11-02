package org.example.service.simple;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//默认创建的队列：持久化，非独占，不是自动删除队列（true,false,false）

@Component
@RabbitListener(queuesToDeclare = @Queue("hello"))
public class Customer {

    @RabbitHandler
    public void receivel(String message) {
        System.out.println("message = " + message);
    }
}
