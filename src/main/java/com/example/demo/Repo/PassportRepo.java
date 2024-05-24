package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
