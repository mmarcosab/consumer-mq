package com.example.demo.repositories;

import com.example.demo.model.PersonDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

	public Person getByName(String name);

	@Query(value = "select new com.example.demo.model.PersonDTO(id, age) from Person where age = 30")
	List<PersonDTO> getPersonsWith30();

}
