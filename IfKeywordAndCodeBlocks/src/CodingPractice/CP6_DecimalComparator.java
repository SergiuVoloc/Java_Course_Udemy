package CodingPractice;

public class CP6_DecimalComparator {
    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        long roundedFirstNumber = (long)(firstNumber * 1000);
        long roundedSecondNumber = (long)(secondNumber * 1000);

        boolean result = roundedFirstNumber == roundedSecondNumber;

        if (result) {
            System.out.println("The first number is equal to the second number");
        }else{
            System.out.println("The first number is not equal to the second number");
        }

        return result;
    }

}
