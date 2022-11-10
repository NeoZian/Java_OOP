public class Basics {
    public static void main(String[] args) {
        String name = "My name is Jewel";
        System.out.println(name);

        String s1= "Jewel";
        String s2 = "Jewel";
        //s1 s2 refer to same object and we cant modify the object
        //when assigning object to a new one the old one will be collected by java garbage collection
        System.out.println(s1+" "+s2);
    }
}
