package com.company.reviewclass3;

public class LogicalOperators {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String day="Sat";

        if(day.equals("Sat")) {
            System.out.println("its  weekend");
            System.out.println("its  weekend");
            System.out.println("its  weekend");
            System.out.println("its  weekend");

        }else if(day.equals("Sun")) {
            System.out.println("its  weekend");
            System.out.println("its  weekend");
            System.out.println("its  weekend");
        }else {
            System.out.println("its week day");
        }


        if(day.equals("Sun")||day.equals("Sat")) {
            System.out.println("its  weekend");
            System.out.println("its  weekend");
            System.out.println("its  weekend");
            System.out.println("its  weekend");
        }else {
            System.out.println("its week day");
        }
    }

}
