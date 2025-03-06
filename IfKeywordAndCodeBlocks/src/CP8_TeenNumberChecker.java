public class CP8_TeenNumberChecker {
    public static void main(String[] args) {

//        isTeen(19);

        hasTeen(1,2,12);
    }



    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree) {

        if(isTeen(numberOne) || isTeen(numberTwo) || isTeen(numberThree)) {
            System.out.println("There is a teen");
            return true;
        }else{
            System.out.println("There is not a teen");
            return false;
         }
    }


    public static boolean isTeen(int singleNumber) {
        int rangeMin = 13;
        int rangeMax = 19;

        if (singleNumber >= rangeMin && singleNumber <= rangeMax){
//            System.out.println("The number is a teen");
            return true;
        }else{
//            System.out.println("The number is not a teen");
            return false;
        }
    }
}
