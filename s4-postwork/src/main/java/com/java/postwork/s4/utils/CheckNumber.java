package com.java.postwork.s4.utils;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class CheckNumber {

    private static final Pattern PATTERN_PHONE = Pattern.compile("^(\\d{2,4}[- .]?){2}\\d{4}$");

    public String cleanNumber(String telefono) {
        return telefono.replaceAll("[^0-9]", "");
    }


}