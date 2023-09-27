package com.campbelltech;

import java.text.MessageFormat;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

// Client
public class Main {
    public static void main(String[] args) {
        SafeDriverDiscount safeDriverDiscount = new SafeDriverDiscount();
        CarInsurance comp1 = new ComprehensiveCarInsurance(2023, "Mercedes-Benz", "E-Class", safeDriverDiscount);
        CarInsurance thirdParty1 = new ThirdPartyCarInsurance(2023, "VW", "Tiguan", safeDriverDiscount);
        System.out.println("Safe Driver Discounts:");
        System.out.println("----------------------");
        print(comp1);
        print(thirdParty1);

        NoClaimsDiscount noClaimsDiscount = new NoClaimsDiscount();
        CarInsurance comp2 = new ComprehensiveCarInsurance(2023, "Mercedes-Benz", "E-Class", noClaimsDiscount);
        CarInsurance thirdParty2 = new ThirdPartyCarInsurance(2023, "VW", "Tiguan", noClaimsDiscount);
        System.out.println("\nNo Claims Discounts:");
        System.out.println("--------------------");
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
                carInsurance.calculatePremium()
        ));
    }

    public static String pascalCaseToSentence(String input) {
        return Pattern.compile("(?=[A-Z])")
                .splitAsStream(input)
                .map(s -> s.isEmpty() ? "" : s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}