package Challenges;

public class OverloadedMethods {
    public static void main(String[] args) {

        System.out.println("68 inch =  " + convertToCentimeters(68)+ " cm");
        System.out.println("5ft 8in = " + convertToCentimeters(5,8)+ " cm");
    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {

        int wholeFeetConverted = heightInFeet * 12;
        int inchTotal = wholeFeetConverted + heightInInches;
        double result = convertToCentimeters(inchTotal);
        return result;

//      shorter but harder to understand and spot errors
//        return convertToCentimeters((heightInFeet * 12) + heightInInches);
    }
}
