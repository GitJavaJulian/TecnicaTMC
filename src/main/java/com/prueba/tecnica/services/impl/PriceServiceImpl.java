package com.prueba.tecnica.services.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.business.IPriceBusiness;
import com.prueba.tecnica.domain.Price;
import com.prueba.tecnica.services.IPriceService;
import com.prueba.tecnica.services.dto.PriceSalidaDTO;
import com.prueba.tecnica.services.exceptions.CustomNotFoundException;
import com.prueba.tecnica.services.mappings.PriceMapper;

@Service
public class PriceServiceImpl implements IPriceService {

    @Autowired
    private IPriceBusiness priceBusiness;
    
    @Override
    public PriceSalidaDTO getPrice(LocalDateTime fecha, long bid, long pid) {
        
        List<Price> priceList =  priceBusiness.getPriceList(fecha, bid, pid);
        
        if (priceList == null || priceList.isEmpty())
            throw new CustomNotFoundException("La busqueda de precio para esa fecha no trae resultados");
        
        Price price = priceBusiness.getPriceByPriority(priceList);

        return PriceMapper.priceToDTO(price, fecha);
    }

}
