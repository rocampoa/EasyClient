package com.easybuy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRoleDTO {
  private Integer roleId;
  private String name;

  public UserRoleDTO(Integer roleId, String name) {
    this.roleId = roleId;
    this.name = name;
  }

}
