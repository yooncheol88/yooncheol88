package com.company.design.strategy;

public class Base64Strategy implements EncodingStrategy {

    @Override
    public String encode(String text) {
        return java.util.Base64.getEncoder().encodeToString(text.getBytes());
    }
}
