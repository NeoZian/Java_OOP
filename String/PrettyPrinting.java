public class PrettyPrinting {
    public static void main(String[] args) {

        float f = 34.56734f;
        System.out.println(f); //34.56434
        System.out.printf("%.2f",f); //34.57  ; it rounds off too!!
        System.out.println();
        System.out.println(Math.PI);  //3.141592653589793
        System.out.printf("%.2f",Math.PI); //3.14

        System.out.println();
        System.out.printf("Hello, this is:%s, from %s","Jewel","Bangladesh");

    }
}
