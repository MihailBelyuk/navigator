package com.solvd.navigator.service.terminal;

import com.solvd.navigator.domain.TravelType;

public class ScannerData {

    private String startPointInput;
    private String endPointInput;
    private TravelType travelTypeInput;

    public String getStartPointInput() {
        return startPointInput;
    }

    public void setStartPointInput(String startPointInput) {
        this.startPointInput = startPointInput;
    }

    public String getDestinationPointInput() {
        return endPointInput;
    }

    public void setEndPointInput(String endPointInput) {
        this.endPointInput = endPointInput;
    }

    public TravelType getTravelTypeInput() {
        return travelTypeInput;
    }

    public void setTravelTypeInput(TravelType travelTypeInput) {
        this.travelTypeInput = travelTypeInput;
    }
}
