
public class Main {
    public static void main(String[] args) {


        int totalSum = 0;
        int matchNumbersFound = 0;

        for (int i = 1; i <= 1000; i++) {

            if ((i % 5 == 0) && (i % 3 == 0 )){
                matchNumbersFound++;
                totalSum += i;
                System.out.println("Match found: " + i);
            }else if (matchNumbersFound == 5){
            break;
            }
        }
        System.out.println("The sum of numbers above is = " + totalSum);

    }
}