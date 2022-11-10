public class Comparison {
    public static void main(String[] args) {

        String s1 = "Jewel";  //same pool
        String s2 = "Jewel";  //same pool
        String sc1 = s1;      //same pool
        // ==
        System.out.println(s1==s2);  //true  bcz same object(when having same value)

        //creating different object of same value
        String s3 = new String("Hossain"); //outside the pool but inside the heap
        String s4 = new String("Hossain");

        System.out.println(s3==s4);  //false; despite having same values but they are different objects in the heap memory

        //camparitor method
        System.out.println(s1.equals(s2)); //if equals then returns true
        System.out.println(s3.equals(s4)); //it also returns true bcz .equals method only compare the string value not their objects

        //how to access specific char from string
        System.out.println(s1.charAt(0));//returns char at index 0 from s1 string
    }
}
