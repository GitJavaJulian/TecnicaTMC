package com.prueba.tecnica.services.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PriceSalidaDTO {
    private long brandId;
    private long productId;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime date;
    private int priceList;
    private String price;
    private String curr;
}
