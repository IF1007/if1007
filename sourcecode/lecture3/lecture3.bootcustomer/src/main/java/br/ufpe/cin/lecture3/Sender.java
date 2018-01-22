package br.ufpe.cin.lecture3;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component
@Lazy
public class Sender {
	RabbitMessagingTemplate template;
	
	@Autowired
	Sender(RabbitMessagingTemplate template){
		this.template = template;
	}

	@Bean
	Queue queue() {
		return new Queue("CustomerQ", false);
	}
	
	public void send(String message){
		template.convertAndSend("CustomerQ", message);
	}

}
