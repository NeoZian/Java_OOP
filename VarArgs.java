import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun( 3,4,"jewel", "salman", "hossain");

    }

    static void fun( int a, int b, String ...s ){  //could be int ...var or char ...v anything like this

        //but remember the VarArgs parameters must  be the last parameters
        //that means you cant have anything like fun(int ...v, int a, int b) ==>> Error!

       System.out.println(Arrays.toString(s));

        System.out.println("a="+a+" b="+b);



    }
}
