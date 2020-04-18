package com.easybuy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QrDetailDTO {
  private Integer qrDetailId;
  private Integer qrequestId;
  private Integer productId;
  private Integer quantity;

  public QrDetailDTO(Integer qrDetailId, Integer qrequestId, Integer productId, Integer quantity) {
    this.qrDetailId = qrDetailId;
    this.qrequestId = qrequestId;
    this.productId = productId;
    this.quantity = quantity;
  }
}
