package com.corebaseit.bevia;

public class Test {

    public static void main(String[] args) {
        // lets program to test composition:

        //lets get some specifications from a computer:
        //the premise is:  a Computer HAS-a Monitor

        /**
         * Notice that the test program is not affected by any change in the Monitor object, thus when looking for
         * code reuse, identify the relationships between your classes, and if you find a HAS-a relationship,
         * then use composition rather than inheritance ;)
         */

        /**
         * ---------> Lets create a Laptop computer:
         *
         *  (notice how we overload the constructors....)
         *
         */
        LaptopComputer laptopComputer = new LaptopComputer ("Apple Computer", "Intel M4", 4, 12, "Retina Display");
        laptopComputer.setLatTopSizeDescription(12); //set the laptop monitor size, which actually describe the size of the laptop!
        //From the latTop computer class:
        String computerBrandName = laptopComputer.describeBrand();
        String computerCPU = laptopComputer.describeCPU();
        int numberOfCores = laptopComputer.describeNumberOfCores();
        double memoryOfComputer = laptopComputer.totalRAM();

        System.out.println("The laptop computer is a: " + laptopComputer.getLatTopSizeDescription() +
                " inch "+ computerBrandName + " with a processor: " + computerCPU
                + " with " + numberOfCores + " cores" + " and " + memoryOfComputer + " GB of memory");

        /**
         * ---------> Now Lets create a MainFrame computer:
         *
         * (notice how we overload the constructors....)
         *
         */
        MainframeComputer mainframeComputer = new MainframeComputer("HP Computer", "Intel XPRO 5.5", 4, 16, "HP", 25, "Retina Display");
        //From the MainFrame computer class:
        String mainFrameComputerBrandName = mainframeComputer.describeBrand();
        String mainFrameComputerCPU = mainframeComputer.describeCPU();
        int mainFrameNumberOfCores = mainframeComputer.describeNumberOfCores();
        double mainFrameMemoryOfComputer = mainframeComputer.totalRAM();
        //over the extended Computer class!
        double mainFrameMonitorSize = mainframeComputer.getMonitorSize();
        String mainFrameMonitorType = mainframeComputer.getMonitorType();
        String mainFrameMonitorBrand = mainframeComputer.getMonitorBrand();

        System.out.println("\nThe MainFrame computer is a: " + mainFrameComputerBrandName +  " with a "+
                mainFrameMonitorSize +" inch " + mainFrameMonitorBrand  + " "+ mainFrameMonitorType + " monitor" + " and with a: "
                + mainFrameComputerCPU + " processor" + " with " + mainFrameNumberOfCores + " cores"
                + " and " + mainFrameMemoryOfComputer + " GB of memory");
    }
}
