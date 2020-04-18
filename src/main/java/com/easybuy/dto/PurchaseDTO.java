package com.easybuy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
public class PurchaseDTO {
  private Integer purchaseId;
  private Integer quotationId;
  private Integer pmethodId;
  private Date purchaseDate;
  private Integer subtotal;
  private Integer tax;

  public PurchaseDTO(Integer purchaseId, Integer quotationId, Integer pmethodId, Date purchaseDate, Integer subtotal, Integer tax) {
    this.purchaseId = purchaseId;
    this.quotationId = quotationId;
    this.pmethodId = pmethodId;
    this.purchaseDate = purchaseDate;
    this.subtotal = subtotal;
    this.tax = tax;
  }
}
