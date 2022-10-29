package com.prueba.tecnica.business;

import java.time.LocalDateTime;
import java.util.List;

import com.prueba.tecnica.domain.Price;

public interface IPriceBusiness {
    
    public List<Price> getPriceList(LocalDateTime fecha, long bid, long pid);

    public Price getPriceByPriority(List<Price> priceList);
   
}
