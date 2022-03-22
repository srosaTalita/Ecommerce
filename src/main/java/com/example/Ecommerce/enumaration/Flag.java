package com.example.Ecommerce.enumaration;

import lombok.Getter;

public enum Flag {
    VISA("Visa"),
    MASTERCARD("Mastercard"),
    ELO("Elo"),
    HIPERCARD("Hipercard");
    
    @Getter
    private final String flag;

    Flag(String flag) {
        this.flag = flag;
    }

}
