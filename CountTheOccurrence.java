import java.util.Scanner;

public class CountTheOccurrence {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num,sn, rem, count=0, cnum;
        System.out.println("Enter a number:");
        num = in.nextInt();
        cnum = num;
        System.out.println("Enter searching number:");
        sn = in.nextInt();

        while(num > 0){

            rem = num%10; //returns the last digit

            if(rem==sn){

                count++;
            }
            num = num/10;  //removing the last digit
        }

        System.out.println("The occurrence of "+sn+" in "+cnum+" is:"+count);
    }
}
