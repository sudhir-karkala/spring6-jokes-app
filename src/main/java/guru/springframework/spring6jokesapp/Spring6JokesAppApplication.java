package guru.springframework.spring6jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "guru.springframework.spring6jokesapp")
public class Spring6JokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring6JokesAppApplication.class, args);
	}

}
