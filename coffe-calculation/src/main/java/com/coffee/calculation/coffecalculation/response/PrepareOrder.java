package com.coffee.calculation.coffecalculation.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrepareOrder {

    public boolean isValid;


    public PrepareOrder(boolean prepare){
        this.isValid = prepare;
    }
}
