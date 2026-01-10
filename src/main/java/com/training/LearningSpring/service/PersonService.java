package com.training.LearningSpring.service;

import com.training.LearningSpring.model.Person;
import com.training.LearningSpring.repository.PersonRepository;
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

  public void deletePerson(Person person) {
    personRepository.delete(person);
  }

  public List<Person> findAll() {
    return personRepository.findAll();
  }

}
