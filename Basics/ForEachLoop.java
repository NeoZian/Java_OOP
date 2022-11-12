package Basics;

public class ForEachLoop {
    public static void main(String[] args) {
        //In the loop body, you can use the loop variable you created rather than using an indexed array element.
        // so you cant you indexing here,
        int[] marks = {33,44,55,66,77,88,99,87,65,43,56};
        int max_score = maximum(marks);
        System.out.println(max_score);

    }

    static int maximum(int[] arr){

        int max_score = arr[0];  //starting with the indexed 0

        for(int num : arr){   //here the int num variable will work like arr[index] value,
            if(num>max_score){
                max_score = num;
            }
        }
        return max_score;

    }
}
