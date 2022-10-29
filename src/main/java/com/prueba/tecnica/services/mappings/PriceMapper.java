package com.prueba.tecnica.services.mappings;

import java.time.LocalDateTime;

import com.prueba.tecnica.domain.Price;
import com.prueba.tecnica.services.dto.PriceSalidaDTO;
import com.prueba.tecnica.utils.CommonUtils;

public class PriceMapper {

    public static PriceSalidaDTO priceToDTO(Price price, LocalDateTime fecha) {
            
        PriceSalidaDTO PriceSalidaDTO = new PriceSalidaDTO();
        PriceSalidaDTO.setBrandId(price.getBrandId());
        PriceSalidaDTO.setProductId(price.getProductId());
        PriceSalidaDTO.setDate(fecha);
        PriceSalidaDTO.setPriceList(price.getPriceList());
        PriceSalidaDTO.setPrice(CommonUtils.floatToString(price.getPrice()));
        PriceSalidaDTO.setCurr(price.getCurr());
        
        return PriceSalidaDTO;
    }
}
