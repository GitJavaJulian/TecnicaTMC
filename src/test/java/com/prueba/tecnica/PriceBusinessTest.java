package com.prueba.tecnica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prueba.tecnica.services.IPriceService;
import com.prueba.tecnica.services.dto.PriceSalidaDTO;
import com.prueba.tecnica.utils.CommonUtils;

@SpringBootTest
public class PriceBusinessTest {

    @Autowired
    private IPriceService priceService;
    private static final long BRAND_ID = 1;
    private static final long PRODUCT_ID = 35455;
    private static final LocalDateTime FECHA_TEST_1 = LocalDateTime.parse("2020-06-14 10:00:00", DateTimeFormatter.ofPattern(CommonUtils.DATE_PATTERN));
    private static final LocalDateTime FECHA_TEST_2 = LocalDateTime.parse("2020-06-14 16:00:00", DateTimeFormatter.ofPattern(CommonUtils.DATE_PATTERN));
    private static final LocalDateTime FECHA_TEST_3 = LocalDateTime.parse("2020-06-14 21:00:00", DateTimeFormatter.ofPattern(CommonUtils.DATE_PATTERN));
    private static final LocalDateTime FECHA_TEST_4 = LocalDateTime.parse("2020-06-15 10:00:00", DateTimeFormatter.ofPattern(CommonUtils.DATE_PATTERN));
    private static final LocalDateTime FECHA_TEST_5 = LocalDateTime.parse("2020-06-16 21:00:00", DateTimeFormatter.ofPattern(CommonUtils.DATE_PATTERN));
    
    @Test
    public void getPriceTest1() {

        PriceSalidaDTO priceSalidaDTO = priceService.getPrice(FECHA_TEST_1, BRAND_ID, PRODUCT_ID);
        assertEquals("35,50", priceSalidaDTO.getPrice());
    }
    
    @Test
    public void getPriceTest2() {

        PriceSalidaDTO priceSalidaDTO = priceService.getPrice(FECHA_TEST_2, BRAND_ID, PRODUCT_ID);
        assertEquals("25,45", priceSalidaDTO.getPrice());
    }   
    
    @Test
    public void getPriceTest3() {

        PriceSalidaDTO priceSalidaDTO = priceService.getPrice(FECHA_TEST_3, BRAND_ID, PRODUCT_ID);
        assertEquals("35,50", priceSalidaDTO.getPrice());
    }   
    
    @Test
    public void getPriceTest4() {

        PriceSalidaDTO priceSalidaDTO = priceService.getPrice(FECHA_TEST_4, BRAND_ID, PRODUCT_ID);
        assertEquals("30,50", priceSalidaDTO.getPrice());
    }   
    
    @Test() 
    public void getPriceTest5() { 
        
        PriceSalidaDTO priceSalidaDTO = priceService.getPrice(FECHA_TEST_5, BRAND_ID, PRODUCT_ID);
        assertEquals("38,95", priceSalidaDTO.getPrice());
    }
}
