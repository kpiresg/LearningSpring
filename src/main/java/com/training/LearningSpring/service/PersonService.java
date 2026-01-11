package com.training.LearningSpring.service;

import com.training.LearningSpring.exception.NotFoundPersonException;
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

  public void deletePersonById(Long id) {
    personRepository.deleteById(id);
  }

  public List<Person> findAll() {
    return personRepository.findAll();
  }

  public Person getById(Long id) {
    return personRepository.findById(id)
        .orElseThrow(() -> new NotFoundPersonException("Pessoa com o ID " + id + " não encontrada"));
  }

  public void updatePerson(Person person) {
    personRepository.save(person);
  }

}
