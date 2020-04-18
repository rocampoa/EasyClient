package com.easyclient.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageDTO {
  private Integer cod;
  private String text;
}
