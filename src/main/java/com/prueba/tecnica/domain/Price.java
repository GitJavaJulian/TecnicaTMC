package com.prueba.tecnica.domain;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Entity
@Table(name = "prices")
public @Data class Price implements Serializable {

    private static final long serialVersionUID = -5907814553083398931L;
    
    @Column(name = "brandId")
    private long brandId;
    @Column(name = "productId")
    private long productId;
    @Id
    @Column(name = "priceList")
    private int priceList;
    @Column(name = "startDate")
    private LocalDateTime startDate;
    @Column(name = "endDate")
    private LocalDateTime endDate;
    @Column(name = "priority")
    private int priority;
    @Column(name = "price")
    private float price;
    @Column(name = "curr")
    private String curr;
}
