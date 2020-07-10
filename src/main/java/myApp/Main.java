package myApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Filter filter = new Filter();

        String[] myGroups = filter.groupMaker(filter.charFilter(argsCheck(args)));

        printer(myGroups, filter.differenceOfSumOfValue(myGroups[0], myGroups[1]));
    }

    public static String argsCheck(String[] args) {
        if (args.length != 1) {
            return new Scanner(System.in).nextLine();
        } else
            return args[0];
    }

    public static void printer(String[] outValue, int outRes) {
        String massage = "The difference between the sums of ASCII codes of the two groups: " + " " + outRes;
        System.out.printf("%s%n", massage);
        for (int i = 1; i < 3; i++) {
            System.out.printf(
                    "graphic representation  -  " +
                            "Decimal representation " +
                            "%d" + " - group: %n", i);
            for (char c : outValue[i - 1].toCharArray()) {
                System.out.printf("\t\t\t%s\t\t\t-\t\t\t%d\n", c, (byte) c);
            }
        }
    }
}
