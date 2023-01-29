package javaCodingProblems.stringsNumbersAndMath;

import java.util.Scanner;

public class convertType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number which you want to convert");
        String number = sc.nextLine();
        System.out.println("Enter type in which you want convert your number (Integer, Long, Float, Double)");
        String type = sc.nextLine();
        switch (type) {
            case "Integer":
                try {
                    if(number.contains(".")){
                        float tempFloat = Float.parseFloat(number);
                        int intType = Math.round(tempFloat);
                        System.out.println("Your number type is integer");
                    } else {
                        int intType = Integer.parseInt(number);
                        System.out.println("Your number type is integer");
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Convert problems");
                    break;
                }
            case "Long":
                try {
                    long longType = Long.parseLong(number);
                    System.out.println("Your number type is long");
                    break;
                } catch (Exception e) {
                    System.out.println("Convert problems");
                    break;
                }
            case "Float":
                try {
                    float floatType = Float.parseFloat(number);
                    System.out.println("Your number type is float");
                    break;
                } catch (Exception e) {
                    System.out.println("Convert problems");
                    break;
                }
            case "Double":
                try {
                    double doubleType = Double.parseDouble(number);
                    System.out.println("Your number type is double");
                    break;
                } catch (Exception e) {
                    System.out.println("Convert problems");
                    break;
                }
            default:
                System.out.println("You entered wrong type!");
        }
    }
}
