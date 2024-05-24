package com.example.demo.Entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Person {
	
	@Id
	private Integer personId;
	private String personName;
	private LocalDate dob;

@OneToOne (mappedBy = "person",cascade = CascadeType.ALL)
private Passport passport;
}
