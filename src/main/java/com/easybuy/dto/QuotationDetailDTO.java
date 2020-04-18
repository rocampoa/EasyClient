package com.easybuy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuotationDetailDTO {
  private Integer qdetailId;
  private Integer quotationId;
  private Integer productId;
  private Integer price;
  private Integer quantity;

  public QuotationDetailDTO(Integer qdetailId, Integer quotationId, Integer productId, Integer price, Integer quantity) {
    this.qdetailId = qdetailId;
    this.quotationId = quotationId;
    this.productId = productId;
    this.price = price;
    this.quantity = quantity;
  }
}
