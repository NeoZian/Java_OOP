import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter spaces then string :");
        String s = in.nextLine();
        System.out.println(s);

        //to remove the spaces before the string value, we use trim().charAt(0);

        String s2 = in.next().trim();
        System.out.println(s2); //removes all the prior spaces

        //similar is for char data type
        char ch = in.next().trim().charAt(0);  //gonna take a char without space
        System.out.println(ch);



    }
}
