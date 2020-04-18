package com.easybuy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonRoleDTO {
  private Integer personId;
  private Integer roleId;

  public PersonRoleDTO(Integer personId, Integer roleId) {
    this.personId = personId;
    this.roleId = roleId;
  }
}
