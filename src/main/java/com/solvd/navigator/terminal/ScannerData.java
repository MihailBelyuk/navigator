package com.solvd.navigator.terminal;

import com.solvd.navigator.domain.TravelType;

public class ScannerData {

    private String startPointInput;
    private String endPointInput;
    private TravelType travelType;

    public String getStartPointInput() {
        return startPointInput;
    }

    public void setStartPointInput(String startPointInput) {
        this.startPointInput = startPointInput;
    }

    public String getEndPointInput() {
        return endPointInput;
    }

    public void setEndPointInput(String endPointInput) {
        this.endPointInput = endPointInput;
    }

    public TravelType getTravelType() {
        return travelType;
    }

    public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }
}
