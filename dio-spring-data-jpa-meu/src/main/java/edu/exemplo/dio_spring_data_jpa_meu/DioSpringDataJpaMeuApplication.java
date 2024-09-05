package edu.exemplo.dio_spring_data_jpa_meu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DioSpringDataJpaMeuApplication {

	public static void main(String[] args) {
		System.out.println("Início da aplicação Spring");
		SpringApplication.run(DioSpringDataJpaMeuApplication.class, args);
		System.out.println("Fim da aplicação Spring");
	}

}
