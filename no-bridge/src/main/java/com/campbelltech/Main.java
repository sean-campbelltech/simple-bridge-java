package com.campbelltech;

import java.text.MessageFormat;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        CarInsurance comp1 = new SafeDriverComprehensiveCarInsurance(2023, "Mercedes-Benz", "E-Class");
        CarInsurance thirdParty1 = new SafeDriverThirdPartyCarInsurance(2023, "VW", "Tiguan");
        System.out.println("Safe Driver Discounts:");
        System.out.println("----------------------");
        print(comp1);
        print(thirdParty1);

        CarInsurance comp2 = new NoClaimsComprehensiveCarInsurance(2023, "Mercedes-Benz", "E-Class");
        CarInsurance thirdParty2 = new NoClaimsThirdPartyCarInsurance(2023, "VW", "Tiguan");
        System.out.println("\nNo Claims Discounts:");
        System.out.println("----------------------");
        print(comp2);
        print(thirdParty2);
    }

    private static void print(CarInsurance carInsurance) {
        System.out.println(MessageFormat.format(
                "{0} Premium: {1} {2} {3} @${4} p/m",
                pascalCaseToSentence(carInsurance.getClass().getSimpleName()),
                String.valueOf(carInsurance.getYear()),
                carInsurance.getMake(),
                carInsurance.getModel(),
                carInsurance.getPremium()
        ));
    }

    public static String pascalCaseToSentence(String input) {
        return Pattern.compile("(?=[A-Z])")
                .splitAsStream(input)
                .map(s -> s.isEmpty() ? "" : s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}