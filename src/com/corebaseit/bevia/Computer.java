package com.corebaseit.bevia;

/**
 * Created by vbevia on 21/06/16.
 * Simple Java Composition Example
 */
public abstract class Computer implements Hardware {

    /**
     ******** A 'HAS-a relationship is expressed with Composition ******
     *
     * --------------> The Computer HAS-a monitor <--------------
     */

    // on composition the existing class Computer does not inherit from a superclass (i.e. Monitor),
    // but instead it holds a reference to that class in a member variable:
    private Monitor monitor; // now we have access to the Monitor Class, just as we had extended it!

    //now the field that will be received by calling method:
    private  String monitorBrand;
    private  double monitorSize;
    private  String monitorType;

    // note: Composition is about creating objects within objects. It simply means using instance variables
    // to refer to other objects!
    // we can now build the constructor and specify some unique characteristics:
    // (notice how we overload the constructor)
    public Computer(String monitorBrand, double monitorSize, String monitorType) {
        //Monitor stuff:
        this.monitorBrand = monitorBrand;
        this.monitorSize = monitorSize;
        this.monitorType = monitorType;

        this.monitor = new Monitor(
                this.monitorBrand,
                this.monitorSize,
                this.monitorType); //lets create a new monitor object!
    }

    public Computer(String monitorBrand) {
        //Monitor stuff:
        this.monitorBrand = monitorBrand;

        this.monitor = new Monitor(
                this.monitorBrand); //lets create a new monitor object!
    }

    // with this, we can now access any getter or setter from Monitor:
    public String getMonitorBrand() {
        return monitor.getMonitorBrand();
    }

    public double getMonitorSize() {
        return monitor.getMonitorSize();
    }

    public String getMonitorType() {
        return monitor.getMonitorType();
    }
}