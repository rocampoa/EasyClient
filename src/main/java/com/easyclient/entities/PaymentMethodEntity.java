package com.easyclient.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "payment_method", schema = "public", catalog = "easybuydb")
public class PaymentMethodEntity {
  private Integer pmethodId;
  private String name;
  private String agreementId;
  private String endpoint;

  @GenericGenerator(
          name = "pmGenerator",
          strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
          parameters = {@org.hibernate.annotations.Parameter(name = "sequence_name", value = "payment_method_pmethod_id_seq"),
                  @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                  @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")}
  )
  @Id
  @GeneratedValue(generator = "pmGenerator")
  @Column(name = "pmethod_id", columnDefinition = "serial")
  public Integer getPmethodId() {
    return pmethodId;
  }

  public void setPmethodId(Integer pmethodId) {
    this.pmethodId = pmethodId;
  }

  @Basic
  @Column(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "agreement_id")
  public String getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }

  @Basic
  @Column(name = "endpoint")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentMethodEntity that = (PaymentMethodEntity) o;
    return Objects.equals(pmethodId, that.pmethodId) &&
            Objects.equals(name, that.name) &&
            Objects.equals(agreementId, that.agreementId) &&
            Objects.equals(endpoint, that.endpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pmethodId, name, agreementId, endpoint);
  }

  public PaymentMethodEntity() {
  }
}
