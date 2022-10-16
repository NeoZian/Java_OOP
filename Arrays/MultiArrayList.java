import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // arraylist of arraylist type

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();


        //initialization of 3 arrayLists
        for (int i = 0; i < 3; i++) {   //like the multidimensional array, these are like rows, each row->each array list
            list.add(new ArrayList<>());
        }

        //adding elements

//        for (int i = 0; i < 3; i++) {
//            list.get(i).add(in.nextInt());
//
//        }

        list.get(0).add(1); //row 0, col 1
        list.get(1).add(2); //row 1, col 1
        list.get(1).add(33); //row 1 col 2
        list.get(2).add(44);//row 2 col 1
        list.get(2).add(55);//row 2 col 2
        list.get(2).add(66);//row 2 col 3
     //   list.get(3).add(66);//error, out of bounds, since we declared for only 3 array lists(max index:2, (0,1,2))


        System.out.println(list);      //prints>> [[1], [2, 33], [44, 55, 66]]

        //creating another multi Array lists

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

        //declaring how many lists are there;
        for (int i = 0; i < 3; i++) {
            list2.add(new ArrayList<>());
        }

        //taking elements from the user
        for (int i = 0; i < 3; i++) {  //3 array lists mean 3 rows
            for (int j = 0; j < 4; j++) {  // assume we'll have 4 elements in each lists

                list2.get(i).add(in.nextInt()); //only i=row, is needed to be mentioned, not the column
                //we'll take total row*col = 3*4 => 12 inputs ;;;;;
            }

        }

        System.out.println(list2);



    }
}
