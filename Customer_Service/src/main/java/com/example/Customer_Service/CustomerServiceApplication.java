package com.example.Customer_Service;

import com.example.Customer_Service.Entity.Customer;
import com.example.Customer_Service.Repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}



	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {

			List<Customer> customerList=List.of(
					Customer.builder()
							.firstName("Hassan")
							.lastName("Elhoumi")
							.email("hassan@gmail.com")
							.build(),
					Customer.builder()
							.firstName("Mohamed")
							.lastName("Elhannaoui")
							.email("hassan@gmail.com")
							.build()

			);
			customerRepository.saveAll(customerList);
		};
	}

}
