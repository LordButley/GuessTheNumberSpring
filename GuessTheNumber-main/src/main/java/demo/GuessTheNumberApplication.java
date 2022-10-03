package demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.java.Log;
import serviceGame.GameRepository;
import serviceRound.RoundRepository;

@Log
@SpringBootApplication
public class GuessTheNumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuessTheNumberApplication.class, args);
		
		System.out.println("Guess the Number Application");
	}
	
	@Bean
	public CommandLineRunner demo(GameRepository appUserRepository, 
			RoundRepository questionRepository) {
		return (args) -> {
			log.info("Demo is working");
			
		};
	}

}
