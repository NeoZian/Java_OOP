import java.util.Arrays;
import java.util.Scanner;



public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("Array:"+ Arrays.toString(arr));
        System.out.println("Enter the indexes that you want to swap:");

        Scanner in = new Scanner(System.in);
        int ind1 = in.nextInt();
        int ind2 = in.nextInt();

        swap(arr,ind1,ind2);

        System.out.println("Latest array:"+ Arrays.toString(arr));

    }

    static void swap(int[] arr, int ind1, int ind2){

        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;

    }
}
