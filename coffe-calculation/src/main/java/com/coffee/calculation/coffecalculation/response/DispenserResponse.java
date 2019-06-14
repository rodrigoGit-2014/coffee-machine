package com.coffee.calculation.coffecalculation.response;

import java.util.List;

public class DispenserResponse {

    private List<Dispenser> dispensers;
    private int port;

    public List<Dispenser> getDispensers() {
        return dispensers;
    }

    public void setDispensers(List<Dispenser> dispensers) {
        this.dispensers = dispensers;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}

