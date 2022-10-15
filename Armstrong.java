import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

       System.out.println(num+" is Armstrong?==>"+isArmstrong(num));


       //let's say we wanna print all the armstrong numbers less than 1000 or all the 3 digits armstrong numbers
        System.out.print("Armstrong numbers less than 1000(3 digits) are: ");
        for(int i=100;i<1000;i++){

            if (isArmstrong(i)){

                System.out.print(i+"\t");
            }
        }

    }

    static boolean isArmstrong(int num){

        int n=num;
        int rem, last_digit, sum=0, digit_exclusion;
        while(num>0){
            last_digit  = num%10;
            sum += Math.pow(last_digit, 3);

           // digit_exclusion
            num = num/10;

        }

        return sum==n;
/*
        if(sum==n){

            return true;
        }
        else {
            return false;
        } */



    }
}
