package com.easyclient.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "inventory", schema = "public", catalog = "easybuydb")
public class InventoryEntity {
  private Integer inventoryId;
  private Integer productId;
  private Integer partnerId;
  private Integer price;
  private Integer quantity;

  @GenericGenerator(
          name = "inventoryGenerator",
          strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
          parameters = {@org.hibernate.annotations.Parameter(name = "sequence_name", value = "inventory_inventory_id_seq"),
                  @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                  @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")}
  )
  @Id
  @GeneratedValue(generator = "inventoryGenerator")
  @Column(name = "inventory_id", columnDefinition = "serial")
  public Integer getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
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
  @Column(name = "partner_id")
  public Integer getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
  }

  @Basic
  @Column(name = "price")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  @Basic
  @Column(name = "quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryEntity that = (InventoryEntity) o;
    return Objects.equals(inventoryId, that.inventoryId) &&
            Objects.equals(productId, that.productId) &&
            Objects.equals(partnerId, that.partnerId) &&
            Objects.equals(price, that.price) &&
            Objects.equals(quantity, that.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryId, productId, partnerId, price, quantity);
  }

  public InventoryEntity() {
  }
}
