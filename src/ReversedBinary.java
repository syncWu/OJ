import java.util.Scanner;

//also use the Integer.toBinaryString(); or Integer.toString(int x,radix y);
public class ReversedBinary {
    //use the recursive to implemention this method
    private static void printBinaryForm(int number){
        int remainder;
        if (number <= 1){
            System.out.println(number);
            return;
        }
        remainder = number % 2;
        printBinaryForm(number >> 1);
        System.out.println(remainder);
    }
    public static void main(String[] args) {
        int number;
        //use the scanner to get the system in
        System.out.println("Enter a Number:");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        if (number < 0){
            System.out.println("Enter a positive number:");
        }else{
            System.out.println("Convert to binary is:");
            printBinaryForm(number);
        }
        System.out.println(Integer.toBinaryString(number));
    }
}
