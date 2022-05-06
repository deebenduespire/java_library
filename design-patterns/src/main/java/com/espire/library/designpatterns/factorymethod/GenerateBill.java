package com.espire.library.designpatterns.factorymethod;

import java.io.IOException;

public class GenerateBill {

    public static void main(String args[]) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();
        int units = 100;

        Plan p = planFactory.getPlan("DOMESTICPLAN");
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.print("Bill amount for " + "DOMESTICPLAN" + " of  " + units + " units is: ");
        p.getRate();
        p.calculate(units);
    }
}
