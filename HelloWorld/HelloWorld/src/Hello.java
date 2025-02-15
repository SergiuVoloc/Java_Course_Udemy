public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Sergiu");



//        boolean isAlien = false;
//        if (isAlien == false) {
//            System.out.println("It's not an Alien");
//            System.out.println("And I'm afraid of Aliens");
//            System.out.println("`------------------------`");
//
//        }
//
//        int topScore = 80;
//        if (topScore < 100){
//            System.out.println("You have got the highest score!");
//        }
//
//        int secondTopScore = 95;
//        if ((topScore > secondTopScore) && (topScore < 100)){
//            System.out.println("Greater than second top score and less than 100!");
//        }
//
//        if ((topScore > 90) || (secondTopScore <= 90)){
//            System.out.println("One of the conditions are true!");
//        }
//
//        boolean isCar = false;
//        if (!isCar){
//            System.out.println("It's a car");
//        }
//
//
//        String makeOfCar = "Ford";
//        boolean isDomestic = (makeOfCar == "Ford") ? true : false;
//
//        if (isDomestic){
//            System.out.println("I'm Domestic");
//        }


        double firstDouble = 20.00d;
        double secondDouble = 80.00d;

        double sum = (firstDouble + secondDouble) * 100.00d;
        System.out.println("sum is " + sum);

        double theRemainder = sum % 40.00d;
        System.out.println("The remainder is " + theRemainder);

        boolean isNoRemainder = theRemainder == 0 ? true : false;
        System.out.println("The total is " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder!");
        }


    }
}
