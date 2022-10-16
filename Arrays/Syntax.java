public class Syntax {
    public static void main(String[] args) {
        //syntax
        // dataType[] variable_name = new dataType[size]

        int[] roll = new int[5];
        int[] test = {1,2,3,4};
        String[] str = {"ami","tumi","amra"};
        int[] marks; // gets defined in the stack memory-> during compile time
        marks = new int[5]; // gets defined in the heap memory-> during runtime
        //heap is shared by multiple threads
        //for each thread there can be a stack

        //stack is much faster than heap memory


        String[] st = new String[5]; //default value: null    -> arr[0],arr[1]...= null

        int[] arr = new int[5]; // default value: 0  -> arr[0],arr[1]...= 0

        System.out.println(st[0]);  //null
        System.out.println(arr[0]);   //0

            // every element of the array works like an object and in java they can be continuous or non-continuous memory allocated
        //when in c,c++ the arrays are always continuously memory allocated

    }
}
