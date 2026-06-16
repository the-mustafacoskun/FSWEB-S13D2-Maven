package org.example;

public class Main {

    public static boolean isPalindrome(int number) {


        if (number < 0) {
           number *= -1;
        }
        String reversed = new StringBuilder(String.valueOf((number))).reverse().toString();
        return number == Integer.parseInt(reversed);

    }

    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;
        if (number <= 1) {
            return false;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        String[] strNumbers = String.valueOf(number).split("");
        StringBuilder sb = new StringBuilder();
        for (String strNumber : strNumbers) {
            switch (strNumber) {
                case "0":
                    sb.append("Zero ");
                    break;
                case "1":
                    sb.append("One ");
                    break;
                case "2":
                    sb.append("Two ");
                    break;
                case "3":
                    sb.append("Three ");
                    break;
                case "4":
                    sb.append("Four ");
                    break;
                case "5":
                    sb.append("Five ");
                    break;
                case "6":
                    sb.append("Six ");
                    break;
                case "7":
                    sb.append("Seven ");
                    break;
                case "8":
                    sb.append("Eight ");
                    break;
                case "9":
                    sb.append("Nine ");
                    break;
                default:
                    break;

            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(-121));
        System.out.println(numberToWords(1010));
    }


}
