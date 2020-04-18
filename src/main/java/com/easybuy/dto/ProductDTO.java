package com.easybuy.dto;


import com.easyclient.entities.ProductEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDTO {
  private Integer productId;
  private String reference;
  private String name;
  private String description;
  private String brand;

  public ProductDTO(ProductEntity data) {
    this.productId = data.getProductId();
    this.reference = data.getReference();
    this.name = data.getName();
    this.description = data.getDescription();
    this.brand = data.getBrand();
  }
}
