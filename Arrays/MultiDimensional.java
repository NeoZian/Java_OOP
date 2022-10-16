import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {

        //2d array
        // for multidimensional arrays declaring Rows is mandatory not the columns

        //must declare rows!
        Scanner in = new Scanner(System.in);

        int[][] marr = new int[3][];  //number of rows can remain undefined

        //taking input
        int[][] mr = new int[2][2];

        for(int row=0;row<mr.length;row++){
            for(int col=0;col<mr[row].length;col++){
                mr[row][col] = in.nextInt();

            }
        }


       int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
                     };

// length of the array means the number of rows there

        //output arr:
        System.out.println("method 1:");
        for(int row=0;row<arr.length;row++){
            for(int col=0; col<arr[row].length;col++){

                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println("method 2:");

        for(int row=0;row< arr.length;row++){
        System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println("method 3:");
        for (int[] i: arr){
            System.out.println(Arrays.toString(i));
        }

        //printing mr:

        for(int row=0;row< mr.length;row++){
            System.out.println(Arrays.toString(mr[row]));
        }


    }
}
