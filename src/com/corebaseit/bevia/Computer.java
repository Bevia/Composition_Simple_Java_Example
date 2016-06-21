package com.corebaseit.bevia;

/**
 * Created by vbevia on 21/06/16.
 * Simple Java Composition Example
 */
public class Computer {

    /**
     ******** A 'HAS-a relationship is expressed with Composition ******
     *
     * --------------> The Computer HAS-a monitor <--------------
     */

    // on composition the existing class Computer does not inherit from a superclass (i.e. Monitor),
    // but instead it holds a reference to that class in a member variable:
    private Monitor monitor;

    // note: Composition is about creating objects within objects. It simply means using instance variables
    // to refer to other objects!
    // we can now build the constructor and specify some unique characteristics:
    public Computer() {

        this.monitor = new Monitor(); //lets create a new monitor object!
        monitor.setMonitorBrand("Apple"); //lets set the brand or manufacturer
        monitor.setMonitorSize(15); //15 inch
        monitor.setMonitorType("Retina Display");
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