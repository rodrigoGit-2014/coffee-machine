package com.coffe.machine.coffeemachine.coffee.preparation;

import com.coffe.machine.coffeemachine.coffee.sizes.SizeCoffee;

public interface Preparation {

    boolean isAvailableToMakeCoffee(SizeCoffee glass);
}
