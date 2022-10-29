package com.prueba.tecnica.services;

import java.time.LocalDateTime;

import com.prueba.tecnica.services.dto.PriceSalidaDTO;

public interface IPriceService {
    
    public PriceSalidaDTO getPrice(LocalDateTime fecha, long bid, long pid);
}
