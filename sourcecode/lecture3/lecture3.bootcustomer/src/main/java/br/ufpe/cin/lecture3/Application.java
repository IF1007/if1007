package br.ufpe.cin.lecture3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	CommandLineRunner init(CustomerRepository customerRepository) {
		return (evt) ->  {
			customerRepository.save(new Customer("Raudinei","raudinei@baea.com"));
			customerRepository.save(new Customer("Bobo","bobo@baea.com"));
			customerRepository.save(new Customer("Charles","charles@baea.com"));
			customerRepository.save(new Customer("Tarantini","tarantini@baea.com"));
			customerRepository.save(new Customer("Nonato","nonato@baea.com"));
			customerRepository.save(new Customer("Paulo Rodrigues","prodrigues@baea.com"));
			customerRepository.save(new Customer("Zé Carlos","zecarlos@baea.com"));
		};
	}
}


