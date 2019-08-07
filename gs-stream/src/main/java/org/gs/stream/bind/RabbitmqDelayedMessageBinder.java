package org.gs.stream.bind;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * rabbitmq 延时消息
 * @author zpp
 * @date 2019/5/8 17:18
 */
public interface RabbitmqDelayedMessageBinder {
    String OUTPUT = "delayed-topic-output";
    String INPUT = "delayed-topic-input";

    @Output(OUTPUT)
    MessageChannel output();

    @Input(INPUT)
    SubscribableChannel input();
}
