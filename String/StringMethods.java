import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "I am Mohammad Jewel";
        System.out.println(Arrays.toString(name.toCharArray())); //return char array, creating new object without modifying the old one
        System.out.println(name); //old object

        System.out.println(name.toUpperCase());

        System.out.println(name.indexOf('M'));//returns the index of the first matched char; for not found : -1
        System.out.println("  I remove spaces before or after the string   ".strip());

        System.out.println(Arrays.toString(name.split(" ")));//whenever gets space " " there the array will be split and returns new array
        //prints: [I, am, Mohammad, Jewel]
    }
}
