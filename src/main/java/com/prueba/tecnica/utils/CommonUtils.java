package com.prueba.tecnica.utils;

import java.text.DecimalFormat;

public class CommonUtils {
    
    public static final String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
    
    public static String floatToString(float valor) {
        
        DecimalFormat formato1 = new DecimalFormat("#.00");
        return formato1.format(valor);
    }
    
}
