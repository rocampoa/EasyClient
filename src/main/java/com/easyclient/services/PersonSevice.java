package com.easyclient.services;

import com.easybuy.dto.PersonDTO;
import com.easyclient.entities.PersonEntity;
import com.easyclient.repositories.PersonRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonSevice {

  private PersonRepostitory pr;

  @Autowired
  public PersonSevice(PersonRepostitory pr) {
    this.pr = pr;
  }

  public PersonDTO getPersonById(Integer id) {
    PersonEntity pe = pr.findById(id).get();
    return new PersonDTO(pe);
  }

  public PersonDTO savePerson(PersonDTO data) {
    PersonEntity pe = new PersonEntity(data);
    pe = pr.save(pe);
    return new PersonDTO(pe);
  }

  public PersonDTO updatePerson(PersonDTO data) {
    PersonEntity pe = pr.findById(data.getPersonId()).get();
    pe.updateEntity(data);
    pe = pr.save(pe);
    return new PersonDTO(pe);
  }


}
