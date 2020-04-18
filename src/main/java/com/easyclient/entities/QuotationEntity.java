package com.easyclient.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "quotation", schema = "public", catalog = "easybuydb")
public class QuotationEntity {
  private Integer quotationId;
  private Integer qrequestId;
  private Integer partnerId;
  private Date creationDate;
  private Date expirationDate;

  @GenericGenerator(
          name = "quotationGenerator",
          strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
          parameters = {@org.hibernate.annotations.Parameter(name = "sequence_name", value = "quotation_detail_qd_id_seq"),
                  @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                  @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")}
  )
  @Id
  @GeneratedValue(generator = "quotationGenerator")
  @Column(name = "quotation_id", columnDefinition = "serial")
  public Integer getQuotationId() {
    return quotationId;
  }

  public void setQuotationId(Integer quotationId) {
    this.quotationId = quotationId;
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
  @Column(name = "partner_id")
  public Integer getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
  }

  @Basic
  @Column(name = "creation_date")
  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  @Basic
  @Column(name = "expiration_date")
  public Date getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuotationEntity that = (QuotationEntity) o;
    return Objects.equals(quotationId, that.quotationId) &&
            Objects.equals(qrequestId, that.qrequestId) &&
            Objects.equals(partnerId, that.partnerId) &&
            Objects.equals(creationDate, that.creationDate) &&
            Objects.equals(expirationDate, that.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotationId, qrequestId, partnerId, creationDate, expirationDate);
  }

  public QuotationEntity() {
  }
}
