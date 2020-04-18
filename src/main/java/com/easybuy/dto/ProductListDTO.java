package com.easybuy.dto;

import com.easyclient.entities.ProductListEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class ProductListDTO {
  private Integer productListId;
  private Integer partnerId;
  private String sPublicationDate;
  private Date publicationDate = new java.sql.Date(new java.util.Date().getTime());
  private Integer status = 0;
  private List<DetailDTO> items;


  public ProductListDTO(ProductListEntity data) {
    this.productListId = data.getProductListId();
    this.partnerId = data.getPartnerId();
    this.publicationDate = data.getPublicationDate();
    this.status = data.getStatus();
  }
}
