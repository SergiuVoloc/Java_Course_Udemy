public class CP_EqualSumChecker {
    public static void main(String[] args) {

        hasEqualSum(1,1,1);
        hasEqualSum(1,1,2);
        hasEqualSum(1,-1,0);

    }

    public static boolean hasEqualSum(int a, int b, int c) {

        if(a+b==c){
            System.out.println("A + B = C");
            return true;
        }else{
            System.out.println("A + B != C");
            return false;
        }
    }
}
