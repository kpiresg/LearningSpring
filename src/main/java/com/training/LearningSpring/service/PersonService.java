package com.training.LearningSpring.service;

import com.training.LearningSpring.dto.PersonDTO;
import com.training.LearningSpring.exception.NotFoundPersonException;
import com.training.LearningSpring.model.Person;
import com.training.LearningSpring.repository.PersonRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

  private PersonRepository personRepository;

  @Autowired
  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  public Person addPerson(Person person) {
    return personRepository.save(person);
  }

  public void deletePersonById(Long id) {
    personRepository.findById(id)
      .orElseThrow(() -> new NotFoundPersonException("Person with id " + id + " not exists"));
      personRepository.deleteById(id);
  }

//  public List<Person> findAll() {
//    return personRepository.findAll();
//  }

  public List<PersonDTO> findAll() {
    List<Person> persons = personRepository.findAll();
    List<PersonDTO> personDTOS = new ArrayList<>();
    for (Person person : persons) {
      personDTOS.add(new PersonDTO(person));
    }
    return personDTOS;
  }

//  public Person getById(Long id) {
//    return personRepository.findById(id)
//        .orElseThrow(() -> new NotFoundPersonException("Pessoa com o ID " + id + " não encontrada"));
//  }

  public PersonDTO getById(Long id) {
    Person person = personRepository.findById(id)
        .orElseThrow(() -> new NotFoundPersonException("Person with id " + id + " not exists"));
    PersonDTO dto = new PersonDTO(person);
    return dto;
  }

  public void updatePerson(Person person) {
    personRepository.save(person);
  }

}
