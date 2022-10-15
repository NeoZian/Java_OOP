public class OverLoading {
    public static void main(String[] args) {
        // same name but different arguments or even the return could be the same

        fun(6,8);
        fun("jewel", 313);

        //which fun to call?  -> gets decided during the compile time
        //for overriding gets decided during run time
    }

    static void fun(int a, int b){

        System.out.println("a+b="+a+"+"+b+"="+(a+b));

    }

    static void fun(String s, int c){
        //overloading

        System.out.println(s+" "+c);


    }
}
