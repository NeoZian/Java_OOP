import java.util.Scanner;

public class Reverse_int {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, rnum=0,rem;

        System.out.println("Enter a number:");
        num = in.nextInt();

        while(num>0){

            rem = num % 10;

            rnum = (rnum*10) + rem;

            num /= 10;   //num = num/10

        }


        System.out.println("reverse :"+rnum);

    }
}
