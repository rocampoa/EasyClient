package com.easybuy.dto;

import com.easyclient.entities.DetailEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DetailDTO {
  private Integer detailId;
  private Integer productListId;
  private Integer productId;
  private Integer quantity;
  private Integer price;

  public DetailDTO(DetailEntity data) {
    this.detailId = data.getDetailId();
    this.productListId = data.getProductListId();
    this.productId = data.getProductId();
    this.quantity = data.getQuantity();
    this.price = data.getPrice();
  }

}
