package com.easybuy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaymentMethodDTO {
  private Integer pmethodId;
  private String name;
  private String agreementId;
  private String endpoint;

  public PaymentMethodDTO(Integer pmethodId, String name, String agreementId, String endpoint) {
    this.pmethodId = pmethodId;
    this.name = name;
    this.agreementId = agreementId;
    this.endpoint = endpoint;
  }
}
