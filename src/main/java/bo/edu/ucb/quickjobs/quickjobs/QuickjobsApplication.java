package bo.edu.ucb.quickjobs.quickjobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class QuickjobsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickjobsApplication.class, args);
	}

}
