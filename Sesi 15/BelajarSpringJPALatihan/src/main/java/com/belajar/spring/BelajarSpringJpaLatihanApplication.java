package com.belajar.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.model.Alamat;
import com.belajar.spring.model.User;
import com.belajar.spring.repository.AlamatRepository;
import com.belajar.spring.repository.UserRepository;

@SpringBootApplication
public class BelajarSpringJpaLatihanApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AlamatRepository alamatRepository;
	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringJpaLatihanApplication.class, args);
	}
	
	public void run(String... args) {
		Alamat alamat1 = new Alamat("Medan","Indonesia","Sumatera Utara", "Simalingkar", "21411");
		Alamat alamat2 = new Alamat("Bandung","Indonesia","Jawa Barat", "Coblong", "21421");
	
		User user1 = new User("juanfelixparsaoran@gmail.com", "Juan", "asdasd", alamat1);
		User user2 = new User("juanfelixparsaorant@gmail.com", "Jan", "asdasd", alamat2);
		userRepository.save(user1);
		userRepository.save(user2);
	}

}
