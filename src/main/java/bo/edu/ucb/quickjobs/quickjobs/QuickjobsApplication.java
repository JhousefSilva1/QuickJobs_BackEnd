package bo.edu.ucb.quickjobs.quickjobs;

//import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080")
@SpringBootApplication
public class QuickjobsApplication {
//	@Bean
//	public ModelMapper modelMapper() {
//		return new ModelMapper();
//	}

	public static void main(String[] args) {
		SpringApplication.run(QuickjobsApplication.class, args);
	}
}
