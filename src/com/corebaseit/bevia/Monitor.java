package com.corebaseit.bevia;

/**
 * Created by vbevia on 21/06/16.
 */
public class Monitor {

    // here is where we model the monitor.
    // lets set some characteristics belonging to a computer monitor:

    private double monitorSize;  // inches
    private String monitorBrand; // manufacturer
    private String monitorType;  // tube, flat panel LED display, retina display, etc.

    public Monitor(String monitorBrand, int monitorSize, String monitorType) {
        this.monitorBrand = monitorBrand;
        this.monitorSize = monitorSize;
        this.monitorType = monitorType;
    }

    public double getMonitorSize() {
        return monitorSize;
    }

    public String getMonitorBrand() {
        return monitorBrand;
    }

    public String getMonitorType() {
        return monitorType;
    }

}
