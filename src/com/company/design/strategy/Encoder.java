package com.company.design.strategy;

public class Encoder {
    private EncodingStrategy encodingStrategy;

    public String getMassage(String massage){
        return this.encodingStrategy.encode(massage);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy){
        this.encodingStrategy = encodingStrategy;
    }

}
