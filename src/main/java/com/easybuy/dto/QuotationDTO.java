package com.easybuy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
public class QuotationDTO {
  private Integer quotationId;
  private Integer qrequestId;
  private Integer partnerId;
  private Date creationDate;
  private Date expirationDate;

  public QuotationDTO(Integer quotationId, Integer qrequestId, Integer partnerId, Date creationDate, Date expirationDate) {
    this.quotationId = quotationId;
    this.qrequestId = qrequestId;
    this.partnerId = partnerId;
    this.creationDate = creationDate;
    this.expirationDate = expirationDate;
  }
}
