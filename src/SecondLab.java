import java.util.Scanner;

public class SecondLab {

    public static void main(String args[]) {
        leapYearChallenge();
//        speedConverterChallenge();
//        timeConverterChallenge();
//        equalityCheckerChallenge();
    }


    public static void leapYearChallenge() {

        Scanner input = new Scanner(System.in);

        boolean isLeapYear;
        System.out.println("What year is it?");
        int leapYear = input.nextInt();

        if (leapYear < 1 || leapYear > 9999) {
            isLeapYear = false;
        } else if (leapYear % 4 == 0) {
            if (leapYear % 100 == 0) {
                if (leapYear % 400 == 0) {
                    System.out.println("This year is a leap year.");
                    isLeapYear = true;
                } else {
                    System.out.println("This year is not a leap year.");
                    isLeapYear = false;
                }
            } else {
                System.out.println("This year is a leap year.");
                isLeapYear = true;
            }
        } else {
            System.out.println("This year is not a leap year.");
            isLeapYear = false;
        }
        System.out.println(isLeapYear);
    }


    public static void speedConverterChallenge() {

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles would you like to convert?");
        float miles = input.nextFloat();

        if (miles <= 0) {
            System.out.println("Please enter a positive value:");
            speedConverterChallenge();
        } else {
            float kilos = (miles * 1.609f);
            System.out.println("There are " + kilos + " kilometers in a mile.");
        }
    }

    public static void timeConverterChallenge() {

        Scanner input = new Scanner(System.in);

        System.out.println("How many minutes would you like to convert?");
        int minutes = input.nextInt();

        int hours = minutes / 60;
        int newMinutes = minutes % 60;

        int days = hours / 24;
        int newHours = hours % 24;

        int years = days / 365;
        int newDays = days % 365;

        System.out.println("There are " + newMinutes + " minutes, "
                + newHours + " hours, " + newDays + " days, and " + years + " years" +
                " in the amount of minutes you inputed.");
    }

    public static void equalityCheckerChallenge() {

        Scanner input = new Scanner(System.in);

        System.out.println("First number?");
        int firstNum = input.nextInt();

        System.out.println("Second number?");
        int secondNum = input.nextInt();

        System.out.println("Third number?");
        int thirdNum = input.nextInt();

        if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("All numbers are the same.");
        } else if (firstNum != secondNum && secondNum != thirdNum
                && thirdNum != firstNum) {
            System.out.println("All numbers are different.");
        } else {
            System.out.println("Numbers are neither all same or all different");
        }


    }

}

