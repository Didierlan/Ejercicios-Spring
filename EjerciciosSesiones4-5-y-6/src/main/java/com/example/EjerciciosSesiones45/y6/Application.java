package com.example.EjerciciosSesiones45.y6;

import com.example.EjerciciosSesiones45.y6.Repository.LaptopRepository;
import com.example.EjerciciosSesiones45.y6.entitis.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(Application.class, args);

		LaptopRepository repository = (LaptopRepository) context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"Azer", "RYZEN-5",12.3);
		Laptop laptop2 = new Laptop(null,"alienware", "RYZEN-9",17.3);

		repository.save(laptop1);
		repository.save(laptop2);
	}

}
