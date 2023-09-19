package com.java.postwork.s4.utils;

import org.springframework.stereotype.Service;

@Service
public class NumberFormatter {
    private static final String INITIAL_NUMBER_FORMAT = "(\\d{2})(\\d{4})(\\d+)";
    private static final String FINAL_NUMBER_FORMAT = "($1)-$2-$3";


    public String format(String phone) {
        return String.valueOf(phone).replaceFirst(INITIAL_NUMBER_FORMAT, FINAL_NUMBER_FORMAT);
    }
}
