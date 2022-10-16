import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {

        //this is dynamic array
        ArrayList<Integer> list = new ArrayList<>(10);  //syntax
        //default capacity is 10, you can leave it empty too
        Scanner in = new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
           list.add(in.nextInt());
        }

        System.out.println(list);

        list.add(34);  //adding new element to the list;
        System.out.println(list);

        //setting new element at index 2(0,1,2 --> 3rd position);
        list.set(2,222);
        System.out.println(list);

        //removing 4th element at index 3
        list.remove(3);
        System.out.println(list);

        //getting an element

        int a = list.get(3);  //3rd indexed element(4th) will be assigned to variable a;

        System.out.println(a); // you can't use like lis[0] --> not allowed


    }
}
