package com.zhsw.rabbitmqaccess.config;


import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitExchangeConfig {
    @Autowired
    private RabbitAdmin rabbitAdmin;

    public RabbitExchangeConfig() {
//        rabbitAdmin.declareBinding(new Binding("mis-equipment-lp", Binding.DestinationType.QUEUE,"mis-equipment-lp","mis-equipment-lp",null));

    }

    @Bean
    FanoutExchange contractFanoutExchange() {
        FanoutExchange fanoutExchange = new FanoutExchange("com.exchange.fanout");
        this.rabbitAdmin.declareExchange(fanoutExchange);
        return fanoutExchange;
    }

    @Bean
    TopicExchange contractTopicExchangeDurable() {
        TopicExchange contractTopicExchange = new TopicExchange("com.exchange.topic");
        this.rabbitAdmin.declareExchange(contractTopicExchange);
        return contractTopicExchange;
    }

    @Bean
    DirectExchange contractDirectExchange() {
        DirectExchange contractDirectExchange = new DirectExchange("com.exchange.direct");
        this.rabbitAdmin.declareExchange(contractDirectExchange);
        return contractDirectExchange;
    }

}