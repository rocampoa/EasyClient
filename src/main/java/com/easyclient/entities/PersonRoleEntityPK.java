package com.easyclient.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PersonRoleEntityPK implements Serializable {
  private Integer personId;
  private Integer roleId;

  @Column(name = "person_id")
  @Id
  public Integer getPersonId() {
    return personId;
  }

  public void setPersonId(Integer personId) {
    this.personId = personId;
  }

  @Column(name = "role_id")
  @Id
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
    PersonRoleEntityPK that = (PersonRoleEntityPK) o;
    return Objects.equals(personId, that.personId) &&
            Objects.equals(roleId, that.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, roleId);
  }

  public PersonRoleEntityPK() {
  }
}
