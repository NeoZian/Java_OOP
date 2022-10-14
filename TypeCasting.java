import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Input 2 numbers:");

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        float div = (float)n1/(float)n2;

        System.out.println("n1/n2 = " + div);

        //automatic promotion in java

        int a = 267;
        byte b = (byte)a;//byte can store max value 256(2^8), here in this case the remainder will be stored
                  // so b  = 267%256 == 11

        System.out.println(b); // b should be 11

        int int_ch = 'A';
        System.out.println(int_ch);

        //java supports unicode values
        System.out.println("السلام عليكم");

        // float + int => float
        // float - double + int => double

        //always gets converted to the higher/bigger one while performing calculations
    }
}
