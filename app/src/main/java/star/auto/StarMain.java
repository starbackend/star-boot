package star.auto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import star.app.StarAppConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(StarAppConfiguration.class)
public class StarMain implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StarMain.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	}

}
