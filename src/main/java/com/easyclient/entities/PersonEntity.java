package com.easyclient.entities;

import com.easyclient.dtos.PersonDTO;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "person", schema = "public", catalog = "easybuydb")
public class PersonEntity {
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

  @GenericGenerator(
          name = "personGenerator",
          strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
          parameters = {@org.hibernate.annotations.Parameter(name = "sequence_name", value = "person_person_id_seq"),
                  @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                  @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")}
  )
  @Id
  @GeneratedValue(generator = "personGenerator")
  @Column(name = "person_id", columnDefinition = "serial")
  public Integer getPersonId() {
    return personId;
  }

  public void setPersonId(Integer personId) {
    this.personId = personId;
  }

  @Basic
  @Column(name = "document_type")
  public Integer getDocumentType() {
    return documentType;
  }

  public void setDocumentType(Integer documentType) {
    this.documentType = documentType;
  }

  @Basic
  @Column(name = "nro_id")
  public String getNroId() {
    return nroId;
  }

  public void setNroId(String nroId) {
    this.nroId = nroId;
  }

  @Basic
  @Column(name = "username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Basic
  @Column(name = "passsword")
  public String getPasssword() {
    return passsword;
  }

  public void setPasssword(String passsword) {
    this.passsword = passsword;
  }

  @Basic
  @Column(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Basic
  @Column(name = "email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Basic
  @Column(name = "phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Basic
  @Column(name = "address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PersonEntity that = (PersonEntity) o;
    return Objects.equals(personId, that.personId) &&
            Objects.equals(documentType, that.documentType) &&
            Objects.equals(nroId, that.nroId) &&
            Objects.equals(username, that.username) &&
            Objects.equals(passsword, that.passsword) &&
            Objects.equals(name, that.name) &&
            Objects.equals(lastName, that.lastName) &&
            Objects.equals(email, that.email) &&
            Objects.equals(phone, that.phone) &&
            Objects.equals(address, that.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, documentType, nroId, username, passsword, name, lastName, email, phone, address);
  }

  public PersonEntity() {
  }

  public PersonEntity(PersonDTO data) {
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

  public void updateEntity(PersonDTO data) {
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

