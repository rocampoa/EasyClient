package com.easyclient.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "person_role", schema = "public", catalog = "easybuydb")
@IdClass(PersonRoleEntityPK.class)
public class PersonRoleEntity {
  private Integer personId;
  private Integer roleId;

  @Id
  @Column(name = "person_id")
  public Integer getPersonId() {
    return personId;
  }

  public void setPersonId(Integer personId) {
    this.personId = personId;
  }

  @Id
  @Column(name = "role_id")
  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PersonRoleEntity that = (PersonRoleEntity) o;
    return Objects.equals(personId, that.personId) &&
            Objects.equals(roleId, that.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, roleId);
  }

  public PersonRoleEntity() {
  }
}
