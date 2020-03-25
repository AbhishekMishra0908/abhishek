package student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient
public class StudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}
	
	@Bean
	StudentRepository repository() {
		StudentRepository repository = new StudentRepository();
		repository.add(new Student( "Abhishek1"));
		repository.add(new Student("skhhed"));
		repository.add(new Student("sggwds"));
		repository.add(new Student("Abhishek4"));		
		repository.add(new Student("Abhishek5"));
		repository.add(new Student("Abhishek6"));		
		repository.add(new Student("Abhishek7"));
		repository.add(new Student("Abhishek8"));
		repository.add(new Student("Abhishek9"));
		repository.add(new Student("Abhishek10"));
		return repository;
	}
	
}
