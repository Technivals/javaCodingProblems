package javaCodingProblems.stringsNumbersAndMath;

import java.math.BigInteger;
import java.util.Scanner;

public class T33BigIntegerConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number which you want to convert to different type");
        try {
            BigInteger bigInt = new BigInteger(sc.nextLine());
            System.out.println("Enter type in which you want to convert your bigInteger(byte/short/int/long)");
            switch (sc.nextLine()) {
                case "byte":
                    byte byteConvert = bigInt.byteValueExact();
                    System.out.println("Conversion to byte is successful");
                    break;
                case "short":
                    short shortConvert = bigInt.shortValueExact();
                    System.out.println("Conversion to short is successful");
                    break;
                case "int":
                    int intConvert = bigInt.intValueExact();
                    System.out.println("Conversion to int is successful");
                    break;
                case "long":
                    long longConvert = bigInt.longValueExact();
                    System.out.println("Conversion to long is successful");
                    break;
                default:
                    System.out.println("You enter wrong type");
            }
        } catch (Exception e) {
            System.out.println("Conversion error");
        }
    }
}
