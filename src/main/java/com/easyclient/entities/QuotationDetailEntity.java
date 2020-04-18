package com.easyclient.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "quotation_detail", schema = "public", catalog = "easybuydb")
public class QuotationDetailEntity {
  private Integer qdetailId;
  private Integer quotationId;
  private Integer productId;
  private Integer price;
  private Integer quantity;

  @GenericGenerator(
          name = "qdetailGenerator",
          strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
          parameters = {@org.hibernate.annotations.Parameter(name = "sequence_name", value = "quotation_detail_qd_id_seq"),
                  @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                  @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")}
  )
  @Id
  @GeneratedValue(generator = "qdetailGenerator")
  @Column(name = "qdetail_id", columnDefinition = "serial")
  public Integer getQdetailId() {
    return qdetailId;
  }

  public void setQdetailId(Integer qdetailId) {
    this.qdetailId = qdetailId;
  }

  @Basic
  @Column(name = "quotation_id")
  public Integer getQuotationId() {
    return quotationId;
  }

  public void setQuotationId(Integer quotationId) {
    this.quotationId = quotationId;
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
    QuotationDetailEntity that = (QuotationDetailEntity) o;
    return Objects.equals(qdetailId, that.qdetailId) &&
            Objects.equals(quotationId, that.quotationId) &&
            Objects.equals(productId, that.productId) &&
            Objects.equals(price, that.price) &&
            Objects.equals(quantity, that.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qdetailId, quotationId, productId, price, quantity);
  }

  public QuotationDetailEntity() {
  }
}
