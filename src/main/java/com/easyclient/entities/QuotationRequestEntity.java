package com.easyclient.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "quotation_request", schema = "public", catalog = "easybuydb")
public class QuotationRequestEntity {
  private Integer qrequestId;
  private Integer personId;
  private Date orderDate;
  private Integer status;

  @GenericGenerator(
          name = "qrequestGenerator",
          strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
          parameters = {@org.hibernate.annotations.Parameter(name = "sequence_name", value = "quotation_request_qr_id_seq"),
                  @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                  @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")}
  )
  @Id
  @GeneratedValue(generator = "qrequestGenerator")
  @Column(name = "qrequest_id", columnDefinition = "serial")
  public Integer getQrequestId() {
    return qrequestId;
  }

  public void setQrequestId(Integer qrequestId) {
    this.qrequestId = qrequestId;
  }

  @Basic
  @Column(name = "person_id")
  public Integer getPersonId() {
    return personId;
  }

  public void setPersonId(Integer personId) {
    this.personId = personId;
  }

  @Basic
  @Column(name = "order_date")
  public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  @Basic
  @Column(name = "status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuotationRequestEntity that = (QuotationRequestEntity) o;
    return Objects.equals(qrequestId, that.qrequestId) &&
            Objects.equals(personId, that.personId) &&
            Objects.equals(orderDate, that.orderDate) &&
            Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qrequestId, personId, orderDate, status);
  }

  public QuotationRequestEntity() {
  }
}
