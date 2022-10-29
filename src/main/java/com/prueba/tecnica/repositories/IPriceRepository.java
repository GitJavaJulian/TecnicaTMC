package com.prueba.tecnica.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.prueba.tecnica.domain.Price;

public interface IPriceRepository extends CrudRepository<Price, Long> {
    
    public List<Price> findAllByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(long bid, long pid, LocalDateTime startDate, LocalDateTime endDate);
}
