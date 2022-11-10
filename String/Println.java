import java.util.Arrays;

public class Println {
    public static void main(String[] args) {

        System.out.println(100);
        System.out.println("Jewel");
        System.out.println(new int[] {1,2,3,4,5}); //doesn't work properly
        System.out.println(Arrays.toString(new int[] {1,2,3,4,5,6,7}));

        Integer num = new Integer(99);
        System.out.println(num.toString()); //prints 99 ; same as System.out.println(99);
    }
}
