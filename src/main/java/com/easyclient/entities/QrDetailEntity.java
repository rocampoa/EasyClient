package com.easyclient.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "qr_detail", schema = "public", catalog = "easybuydb")
public class QrDetailEntity {
  private Integer qrDetailId;
  private Integer qrequestId;
  private Integer productId;
  private Integer quantity;


  @GenericGenerator(
          name = "qrdGenerator",
          strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
          parameters = {@org.hibernate.annotations.Parameter(name = "sequence_name", value = "qr_detail_qr_detail_id_seq"),
                  @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                  @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")}
  )
  @Id
  @GeneratedValue(generator = "qrdGenerator")
  @Column(name = "qr_detail_id", columnDefinition = "serial")
  public Integer getQrDetailId() {
    return qrDetailId;
  }

  public void setQrDetailId(Integer qrDetailId) {
    this.qrDetailId = qrDetailId;
  }

  @Basic
  @Column(name = "qrequest_id")
  public Integer getQrequestId() {
    return qrequestId;
  }

  public void setQrequestId(Integer qrequestId) {
    this.qrequestId = qrequestId;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QrDetailEntity that = (QrDetailEntity) o;
    return Objects.equals(qrDetailId, that.qrDetailId) &&
            Objects.equals(qrequestId, that.qrequestId) &&
            Objects.equals(productId, that.productId) &&
            Objects.equals(quantity, that.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qrDetailId, qrequestId, productId, quantity);
  }

  public QrDetailEntity() {
  }
}
