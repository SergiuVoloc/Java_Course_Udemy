public class Main {
    public static void main(String[] args) {

        for(int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }

        for(double rate = 2; rate <= 5; rate++){
            double interestAmount = calculateInterest(10000, rate);
            System.out.println( rate + "%"+ " of 10k = " + interestAmount);
        }


        for(double i = 7.5; i <= 10; i+= 0.25){
            double interestAmount = calculateInterest(100, i);
            if(interestAmount > 8.5){
                break;
            }
            System.out.println( i + "%"+ " of 10 = " + interestAmount);
        }

    }


    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }


}
