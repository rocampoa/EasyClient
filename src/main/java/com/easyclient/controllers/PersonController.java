package com.easyclient.controllers;

import com.easybuy.dto.MessageDTO;
import com.easybuy.dto.PersonDTO;
import com.easyclient.services.PersonSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/person/")
public class PersonController {

  private PersonSevice ps;

  @Autowired
  public PersonController(PersonSevice ps) {
    this.ps = ps;
  }

  @GetMapping
  public String saludo() {
    return "hola mundo";
  }

  @GetMapping(value = "{id}")
  public PersonDTO getPersonById(@PathVariable("id") Integer id) {
    return ps.getPersonById(id);
  }

  @PostMapping(path = "save")
  public MessageDTO savePerson(@RequestBody PersonDTO data) {
    ps.savePerson(data);
    return new MessageDTO(1, "Registro Grabado Exitosamente");
  }

  @PutMapping()
  public PersonDTO updatePerson(@RequestBody PersonDTO data) {
    return ps.updatePerson(data);
  }

}
