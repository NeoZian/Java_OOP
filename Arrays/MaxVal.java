import java.util.Arrays;

public class MaxVal {
    public static void main(String[] args) {
        int[] arr = {22,34,1,23,564,544,45,56};

        System.out.println("Array:"+ Arrays.toString(arr));

        System.out.println(max(arr));
    }


    static int max(int[] arr){

        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>maxVal){
                maxVal = arr[i];
            }


        }

        return maxVal;
    }
}
