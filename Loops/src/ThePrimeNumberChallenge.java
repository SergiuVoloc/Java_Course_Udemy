public class ThePrimeNumberChallenge {
    public static void main(String[] args) {

        int primeNumbers = 0;

//        Check numbers from a given range and stop when found 3, print them
        for(int i = 10; i <= 50; i++){
            if(isPrime(i)){
                primeNumbers++;
                System.out.println("A prime number found: " + i);
            }

            if (primeNumbers == 3){
                System.out.println("3 Prime numbers reached: " + primeNumbers);
                break;
            }
        }



//        Another way of doing this:#
//        for(int i = 10; primeNumbers< 3 && i <= 50; i++){
//            if(isPrime(i)){
//                primeNumbers++;
//                System.out.println("A prime number found: " + i);
//            }
//        }



    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return(wholeNumber == 2);
        }
        for( int divisor = 2; divisor <= wholeNumber/2; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }



}
