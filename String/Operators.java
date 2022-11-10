import java.util.AbstractList;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        System.out.println('a' + 'b');  //97+98 == 195
        System.out.println("a"+"b"); //ab
        System.out.println('a'+3); //100
        System.out.println((char) ('a'+3)); //97+3==>100th ascii index == d
        System.out.println("Jewel"+ new ArrayList<>()); //Jewel[]

        String ans = new Integer(55) + "" + new ArrayList<>();  // at least on of them should be string else it wont work
        System.out.println(ans); //55[]

    }
}
