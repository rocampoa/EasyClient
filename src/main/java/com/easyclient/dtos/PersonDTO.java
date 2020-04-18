package com.easyclient.dtos;

import com.easyclient.entities.PersonEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonDTO {
  private Integer personId;
  private Integer documentType;
  private String nroId;
  private String username;
  private String passsword;
  private String name;
  private String lastName;
  private String email;
  private String phone;
  private String address;

  public PersonDTO(PersonEntity data) {
    this.personId = data.getPersonId();
    this.documentType = data.getDocumentType();
    this.nroId = data.getNroId();
    this.username = data.getUsername();
    this.passsword = data.getPasssword();
    this.name = data.getName();
    this.lastName = data.getLastName();
    this.email = data.getEmail();
    this.phone = data.getPhone();
    this.address = data.getAddress();
  }
}
