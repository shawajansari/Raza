package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Entity.Passport;
import com.example.demo.Entity.Person;
import com.example.demo.Repo.PersonRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Passport passport=new Passport();
		passport.setPassportId(201);
		passport.setPassportNum("dbh3j2n323n2nmn");
		passport.setIssuDtae(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(20));
		
		
		
		Person person=new Person();
		person.setDob(LocalDate.now().minusYears(20));
		person.setPersonId(101);
		person.setPersonName("Ashok");
		
		passport.setPerson(person);
		person.setPassport(passport);
		
		   PersonRepo personRepo = context.getBean(PersonRepo.class);
		   personRepo.save(person);
		   System.out.println("record inserted");
		   
	}

}
