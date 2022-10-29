package com.prueba.tecnica.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.services.IPriceService;
import com.prueba.tecnica.services.dto.PriceSalidaDTO;
import com.prueba.tecnica.utils.CommonUtils;

@RestController
@RequestMapping("/api")
public class PriceController {

    @Autowired
    private IPriceService priceService;
    
    @GetMapping("/v1/brands/{bid}/products/{pid}")
    public ResponseEntity<PriceSalidaDTO> getPrice(@RequestParam(name = "fecha", required = true) @DateTimeFormat(pattern = CommonUtils.DATE_PATTERN) LocalDateTime fecha,
                                   @PathVariable long bid,
                                   @PathVariable long pid) {
            PriceSalidaDTO PriceSalidaDTO = priceService.getPrice(fecha, bid, pid);
            return ResponseEntity.ok(PriceSalidaDTO);
    }
}
