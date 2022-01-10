package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpa.entities.User;
import com.example.jpa.repository.UserRepository;

@SpringBootApplication
public class JpatesteApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository ur;

	public static void main(String[] args) {
		SpringApplication.run(JpatesteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ur.save(new User("Maria","maria@gmail.com", 1348.74));
		ur.save(new User("Joao Silva","joao@gmail.com",9276.62));
		ur.save(new User("Carlos Silva","carlos@gmail.com",7318.75));
		ur.save(new User("Adriana","adriana@gmail.com",10688.93));
		ur.save(new User("Karina","karina@gmail.com",7251.28));
		ur.save(new User("Carlos Marques","carlos@gmail.com",5485.79));
		ur.save(new User("Carlos Pereira","carlos@gmail.com",3519.41));
		ur.save(new User("Ana Maria","ana@gmail.com",2569.20));
		ur.save(new User("Beatriz","beatriz@gmail.com",3853.33));
		ur.save(new User("Joana","joana@gmail.com",4222.91));
		ur.save(new User("Tulio Augusto","tulio@gmail.com",9453.69));
		ur.save(new User("Augusto","augusto@gmail.com",4119.91));
		ur.save(new User("Marta","marta@gmail.com",4519.15));
		ur.save(new User("Silvio","silvio@gmail.com",5285.68));
		ur.save(new User("Washington","washington@gmail.com",6439.99));
		ur.save(new User("Teresa","teresa@gmail.com",8929.78));
		ur.save(new User("Luciano","luciano@gmail.com",3360.72));
		ur.save(new User("Fabiana","fabiana@gmail.com",2532.83));
		ur.save(new User("Fabio","fabio@gmail.com",5912.88));
		ur.save(new User("Gisele","gisele@gmail.com",7558.26));
		ur.save(new User("Larissa","larissa@gmail.com",2362.04));
		ur.save(new User("Natanael","natanael@gmail.com",6860.63));
		ur.save(new User("Meire","meire@gmail.com",3553.40));
		ur.save(new User("Ana Carolina","ana@gmail.com",1404.28));
		ur.save(new User("Filipe","filipe@gmail.com",3388.73));
	}
	
	

}
