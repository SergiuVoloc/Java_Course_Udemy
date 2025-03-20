package CodingPractice;

public class CP9_AreaCalculator {
    public static void main(String[] args) {

        area(5.0);
        area(-1.0);
        area(5.0,4.0);
        area(-1.0, 4.0);
    }


    public static double area(double radius){

        if(radius < 0){
            System.out.println("radius is negative");
            return -1.0;
        }else{
            double calculatedArea = radius * radius * Math.PI;
            System.out.println(calculatedArea);
            return calculatedArea;
        }
    }

    public static double area(double x, double y){

        if(x < 0 || y < 0){
            System.out.println("x or y is negative");
            return -1.0;
        }else{
            double calculatedArea = x * y;
            System.out.println(calculatedArea);
            return calculatedArea;
        }
    }


}
