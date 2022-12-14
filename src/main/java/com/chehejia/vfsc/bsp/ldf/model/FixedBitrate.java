package com.chehejia.vfsc.bsp.ldf.model;

public class FixedBitrate extends Bitrate {
    private double value;

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " kbps";
    }
}
