package com.training.LearningSpring.controller;

import com.training.LearningSpring.dto.PersonDTO;
import com.training.LearningSpring.model.Person;
import com.training.LearningSpring.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

  private PersonService personService;

  @Autowired
  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  @GetMapping("/list")
  public ResponseEntity<List> listPerson() {
    List<PersonDTO> personsDto = personService.findAll();
    return new ResponseEntity<List>(personsDto, HttpStatus.OK);
  }

  @GetMapping("/find/{id}")
  public ResponseEntity<PersonDTO> findById(@PathVariable Long id) {
    PersonDTO personDto = personService.getById(id);
    return new ResponseEntity<>(personDto, HttpStatus.OK);
  }

  @PostMapping("/add")
  public ResponseEntity<Person> addPerson(@RequestBody Person person) {
    personService.addPerson(person);
    return new ResponseEntity(person, HttpStatus.CREATED);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<Person> deletePerson(@PathVariable("id") Long id) {
    personService.deletePersonById(id);
    return new ResponseEntity(id, HttpStatus.OK);
  }

  @PatchMapping("/update")
  public ResponseEntity<Person> updatePerson(@RequestBody Person person) {
    personService.updatePerson(person);
    return new ResponseEntity(person, HttpStatus.OK);
  }
}
