import java.util.Arrays;

public class Method_changingValue {

    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};

        System.out.println("before calling:"+Arrays.toString(arr));

        changingValue(arr);

        System.out.println("after calling:"+Arrays.toString(arr)); //value has been changed!!!


    }

    static void changingValue(int[] ar){

        ar[0]=0;  //no new object, just the same object
        ar[1]=11;  //no new object, just the same object

    }
}
