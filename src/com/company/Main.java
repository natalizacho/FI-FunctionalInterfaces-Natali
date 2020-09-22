package com.company;

public class Main {

    public static void main(String[] args) {
        //ZeroArgument
        //Lambda expression
        FunctionalInterface1 m = () ->{
            return "NGZ";
        };
        System.out.println(m.printNGZ());

        //OneArgument
        //Lambda expression
        FunctionalInterface2 i = (num) -> num + 5;
        System.out.println(i.tal(17));

        //TwoArgument
        //Lambda expression
        FunctionalInterface3 n = (str1, str2) -> str1 + str2;
        System.out.println(n.navn("Natali", "Zacho"));

    }
}
