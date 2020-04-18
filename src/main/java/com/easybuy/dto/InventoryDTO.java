package com.easybuy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InventoryDTO {
  private Integer inventoryId;
  private Integer productId;
  private Integer partnerId;
  private Integer price;
  private Integer quantity;

  public InventoryDTO(Integer inventoryId, Integer productId, Integer partnerId, Integer price, Integer quantity) {
    this.inventoryId = inventoryId;
    this.productId = productId;
    this.partnerId = partnerId;
    this.price = price;
    this.quantity = quantity;
  }
}
