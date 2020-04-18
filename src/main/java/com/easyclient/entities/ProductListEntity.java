package com.easyclient.entities;

import com.easybuy.dto.ProductListDTO;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Data
@Entity
@Table(name = "product_list", schema = "public", catalog = "easybuydb")
public class ProductListEntity {
  private Integer productListId;
  private Integer partnerId;
  private Date publicationDate;
  private Integer status = 0;

  @GenericGenerator(
          name = "productListGenerator",
          strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
          parameters = {@org.hibernate.annotations.Parameter(name = "sequence_name", value = "product_list_product_list_id_seq"),
                  @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                  @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")}
  )
  @Id
  @Column(name = "product_list_id", columnDefinition = "serial")
  @GeneratedValue(generator = "productListGenerator")
  public Integer getProductListId() {
    return productListId;
  }

  public void setProductListId(Integer productListId) {
    this.productListId = productListId;
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
  @CreationTimestamp
  @Column(name = "publication_date")
  public Date getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(Date publicationDate) {
    this.publicationDate = publicationDate;
  }

  @Basic
  @Column(name = "status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status == null ? 0 : status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductListEntity that = (ProductListEntity) o;
    return Objects.equals(productListId, that.productListId) &&
            Objects.equals(partnerId, that.partnerId) &&
            Objects.equals(publicationDate, that.publicationDate) &&
            Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productListId, partnerId, publicationDate, status);
  }

  public ProductListEntity(ProductListDTO data) {
    this.productListId = data.getProductListId();
    this.partnerId = data.getPartnerId();
    this.publicationDate = data.getPublicationDate();
    this.status = data.getStatus();
  }
}
