package com.example.demo.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Passport {
	
	
	@Id
	private Integer passportId;
	private String passportNum;
	private LocalDate issuDtae;
	private LocalDate expDate;
	
	
	@OneToOne
	@JoinColumn(name="person_id")
	private Person person;
	
	
	

}
