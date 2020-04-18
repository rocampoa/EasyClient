package com.easyclient.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "purchase", schema = "public", catalog = "easybuydb")
public class PurchaseEntity {
  private Integer purchaseId;
  private Integer quotationId;
  private Integer pmethodId;
  private Date purchaseDate;
  private Integer subtotal;
  private Integer tax;

  @GenericGenerator(
          name = "purchaseGenerator",
          strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
          parameters = {@org.hibernate.annotations.Parameter(name = "sequence_name", value = "purchase_purchase_id_seq"),
                  @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                  @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")}
  )
  @Id
  @GeneratedValue(generator = "purchaseGenerator")
  @Column(name = "purchase_id", columnDefinition = "serial")
  public Integer getPurchaseId() {
    return purchaseId;
  }

  public void setPurchaseId(Integer purchaseId) {
    this.purchaseId = purchaseId;
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
  @Column(name = "pmethod_id")
  public Integer getPmethodId() {
    return pmethodId;
  }

  public void setPmethodId(Integer pmethodId) {
    this.pmethodId = pmethodId;
  }

  @Basic
  @Column(name = "purchase_date")
  public Date getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(Date purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  @Basic
  @Column(name = "subtotal")
  public Integer getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(Integer subtotal) {
    this.subtotal = subtotal;
  }

  @Basic
  @Column(name = "tax")
  public Integer getTax() {
    return tax;
  }

  public void setTax(Integer tax) {
    this.tax = tax;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PurchaseEntity that = (PurchaseEntity) o;
    return Objects.equals(purchaseId, that.purchaseId) &&
            Objects.equals(quotationId, that.quotationId) &&
            Objects.equals(pmethodId, that.pmethodId) &&
            Objects.equals(purchaseDate, that.purchaseDate) &&
            Objects.equals(subtotal, that.subtotal) &&
            Objects.equals(tax, that.tax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseId, quotationId, pmethodId, purchaseDate, subtotal, tax);
  }

  public PurchaseEntity() {
  }
}
