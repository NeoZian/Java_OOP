public class Shadowing {

    static int x=10; //this will be shadowed later on at line 10
    public static void main(String[] args) {

        System.out.println(x); //x=10

        getCalled(x);

        int x=20;  // class variable is shadowed by this and new scope is beginning from here
        System.out.println(x);



    }

    public static void getCalled(int x){

        System.out.println("x  in the function: "+x);


    }
}
