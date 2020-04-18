package com.easybuy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
public class QuotationRequestDTO {
  private Integer qrequestId;
  private Integer personId;
  private Date orderDate;
  private Integer status;

  public QuotationRequestDTO(Integer qrequestId, Integer personId, Date orderDate, Integer status) {
    this.qrequestId = qrequestId;
    this.personId = personId;
    this.orderDate = orderDate;
    this.status = status;
  }
}
