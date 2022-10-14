import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args){

        System.out.print("Enter your job title:");
        Scanner in =  new Scanner(System.in);
        String job = in.next().trim();

        switch (job){

            case "Doctor":

                System.out.println("Extreme pressure, don't you feel that?");
                break;

            case "Govt":
                System.out.println("Low money, high respect and free time prolly!");
                break;
            case "Engineer":
                System.out.println("Enter your types of engineering:");
                String type = in.next();
                switch (type){

                    case "CSE":
                        System.out.println("Cool n awesome, go on, change it all");
                        break;
                    case "EEE":
                        System.out.println("Not a bad one!");
                        break;

                    default:
                        System.out.println("PLease enter either `EEE` OR `CSE`");

                }
                break;
            default:
                System.out.println("Please enter from: Doctor/Govt/Engineer");


        }

    }
}
