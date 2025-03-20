package CodingPractice;

public class CP3_MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int mb = kiloBytes/1024;
        int remainingKb = kiloBytes % 1024 ;

        if(kiloBytes < 0){
            System.out.println("Invalid Value");

        }else{

            System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainingKb + " KB");
        }
    }
}
