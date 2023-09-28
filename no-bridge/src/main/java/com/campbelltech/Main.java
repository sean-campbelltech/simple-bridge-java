package com.campbelltech;

import java.text.MessageFormat;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        CarInsurance comp1 = new SafeDriverComprehensive(2023, "Mercedes-Benz", "E-Class");
        CarInsurance thirdParty1 = new SafeDriverThirdParty(2023, "VW", "Tiguan");
        CarInsurance propertyDamage1 = new SafeDriverPropertyDamage(2023, "Cadillac", "Escalade");
        System.out.println("Safe Driver Discounts:");
        System.out.println("----------------------");
        print(comp1);
        print(thirdParty1);
        print(propertyDamage1);

        CarInsurance comp2 = new NoClaimsComprehensive(2023, "Mercedes-Benz", "E-Class");
        CarInsurance thirdParty2 = new NoClaimsThirdParty(2023, "VW", "Tiguan");
        CarInsurance propertyDamage2 = new NoClaimsPropertyDamage(2023, "Cadillac", "Escalade");
        System.out.println("\nNo Claims Discounts:");
        System.out.println("--------------------");
        print(comp2);
        print(thirdParty2);
        print(propertyDamage2);

        CarInsurance comp3 = new AutoOwnersComprehensive(2023, "Mercedes-Benz", "E-Class");
        CarInsurance thirdParty3 = new AutoOwnersThirdParty(2023, "VW", "Tiguan");
        CarInsurance propertyDamage3 = new AutoOwnersPropertyDamage(2023, "Cadillac", "Escalade");
        System.out.println("\nAuto Owners Discounts:");
        System.out.println("----------------------");
        print(comp3);
        print(thirdParty3);
        print(propertyDamage3);
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

    private static String pascalCaseToSentence(String input) {
        return Pattern.compile("(?=[A-Z])")
                .splitAsStream(input)
                .map(s -> s.isEmpty() ? "" : s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}