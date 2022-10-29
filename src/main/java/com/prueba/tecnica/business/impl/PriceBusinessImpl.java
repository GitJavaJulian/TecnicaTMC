package com.prueba.tecnica.business.impl;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prueba.tecnica.business.IPriceBusiness;
import com.prueba.tecnica.domain.Price;
import com.prueba.tecnica.repositories.IPriceRepository;

@Component
public class PriceBusinessImpl implements IPriceBusiness {

    @Autowired
    private IPriceRepository priceRepository;
    
    @Override
    public List<Price> getPriceList(LocalDateTime fecha, long bid, long pid) {
            
        return priceRepository.findAllByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(bid, pid, fecha, fecha);
    }

    @Override
    public Price getPriceByPriority(List<Price> priceList) {  

        if(priceList.size() == 1)
            return priceList.get(0);

        Optional<Price> priceMaxPriority = priceList
                .stream()
                .max(Comparator.comparing(Price::getPriority));
        
        return priceMaxPriority.get();  
    }
}
