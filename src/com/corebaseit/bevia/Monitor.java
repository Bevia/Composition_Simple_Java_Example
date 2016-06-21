package com.corebaseit.bevia;

/**
 * Created by vbevia on 21/06/16.
 */
public class Monitor {

    // here is where we model the monitor.
    // lets set some characteristics belonging to a computer monitor:

    private double monitorSize;  // inches
    private double monitorResolution; //indicates how density the pixels are packed.
    private boolean monitorIsAttached; // as part of the computer, or sold separately.
    private String monitorBrand; // manufacturer
    private String monitorType;  // tube, flat panel LED display, retina display, etc.

    public double getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(double monitorSize) {
        this.monitorSize = monitorSize;
    }

    public double getMonitorResolution() {
        return monitorResolution;
    }

    public void setMonitorResolution(double monitorResolution) {
        this.monitorResolution = monitorResolution;
    }

    public boolean isMonitorIsAttached() {
        return monitorIsAttached;
    }

    public void setMonitorIsAttached(boolean monitorIsAttached) {
        this.monitorIsAttached = monitorIsAttached;
    }

    public String getMonitorBrand() {
        return monitorBrand;
    }

    public void setMonitorBrand(String monitorBrand) {
        this.monitorBrand = monitorBrand;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }
}
