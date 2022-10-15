public class Methods {
    public static void main(String[] args) {

        //there is no call by reference in Java
        //there is nothing like pointers(*) in java too

        String name = "Jewel";
        int a = 10;

        check(name,a);//passing value of the reference variable
        System.out.println("string has not been changed in main; so: name="+name+" value:a="+a);

    }

     static void check(String name, int a) {    //method should be static since main method is static

        name = "Salman";  //creating new object
        a = 20; //creating new object

         System.out.println("new string name="+name+" value:a="+a);



    }


}
