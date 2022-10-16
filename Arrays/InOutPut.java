import java.util.Arrays;
import java.util.Scanner;

public class InOutPut {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i=0;i<5;i++){
            arr[i] = in.nextInt();

        }

        //there are several ways to print the array!
        //method 1
        System.out.println("Method 1:");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println("\n"+"Method 2:");
        //method 2
        //using for each loop

        for (int i: arr){
            System.out.print(i +" ");
        }

        //method:3
        //easiest one
        //it converts the array to string then print it for java
        // it automatically adds []-> brackets and commas(,) too!!!

        System.out.println("\n"+"Method 3:");
        System.out.println(Arrays.toString(arr));

    }
}
