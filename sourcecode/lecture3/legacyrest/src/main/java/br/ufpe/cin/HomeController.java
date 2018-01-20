package br.ufpe.cin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public Greeting sayHello(){
		return new Greeting("Bora BAÊA!");
	}
	
}
