package com.easyclient.entities;

import com.easybuy.dto.DetailDTO;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "detail", schema = "public", catalog = "easybuydb")
public class DetailEntity {
  private Integer detailId;
  private Integer productListId;
  private Integer productId;
  private Integer quantity;
  private Integer price;

  @GenericGenerator(
          name = "detailGenerator",
          strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
          parameters = {@org.hibernate.annotations.Parameter(name = "sequence_name", value = "detail_detail_id_seq"),
                  @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                  @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")}
  )
  @Id
  @GeneratedValue(generator = "detailGenerator")
  @Column(name = "detail_id", columnDefinition = "serial")
  public Integer getDetailId() {
    return detailId;
  }

  public void setDetailId(Integer detailId) {
    this.detailId = detailId;
  }

  @Basic
  @Column(name = "product_list_id")
  public Integer getProductListId() {
    return productListId;
  }

  public void setProductListId(Integer productListId) {
    this.productListId = productListId;
  }

  @Basic
  @Column(name = "product_id")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  @Basic
  @Column(name = "quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  @Basic
  @Column(name = "price")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DetailEntity that = (DetailEntity) o;
    return Objects.equals(detailId, that.detailId) &&
            Objects.equals(productListId, that.productListId) &&
            Objects.equals(productId, that.productId) &&
            Objects.equals(quantity, that.quantity) &&
            Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailId, productListId, productId, quantity, price);
  }

  public DetailEntity() {
  }

  public DetailEntity(DetailDTO data) {
    this.detailId = data.getDetailId();
    this.productListId = data.getProductListId();
    this.productId = data.getProductId();
    this.quantity = data.getQuantity();
    this.price = data.getPrice();
  }


}
