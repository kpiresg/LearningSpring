package com.training.LearningSpring.dto;

import com.training.LearningSpring.model.Person;

public class PersonDTO {

  private String name;
  private int age;
  private String profession;

  public PersonDTO() {

  }

  public PersonDTO(Person person) {
    this.name = person.getName();
    this.age = person.getAge();
    this.profession = person.getProfession();
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getProfession() {
    return profession;
  }
}
