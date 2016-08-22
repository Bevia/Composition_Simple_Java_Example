package com.corebaseit.bevia;

public class Test {

    public static void main(String[] args) {
        // lets program to test composition:

        //lets get some specifications from a computer:
        //the premise is:  a Computer HAS-a Monitor

        Computer computer = new Computer("Apple", 15, "Retina Display");

        String monitorBrandName = computer.getMonitorBrand();
        double monitorSize = computer.getMonitorSize();
        String monitorType = computer.getMonitorType();

        System.out.println("The monitor is a " + monitorSize
                + " inch " + monitorType + " monitor manufactured by: " + monitorBrandName);

        /**
         * Notice that the test program is not affected by any change in the Monitor object, thus when looking for
         * code reuse, identify the relationships between your classes, and if you find a HAS-a relationship,
         * then use composition rather than inheritance ;)
         */
    }
}
