public class Main {
    public static void main(String[] args) {

        //always find the relation between row and column

        System.out.println("Pattern 1:");
        for (int i = 1; i <=5 ; i++) {  //i=row
            for (int j = 1; j <=i ; j++) {  //j = col

                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("Pattern 2:");
        for (int i = 1; i <=5 ; i++) {  //i=row
            for (int j = 5; j >=i ; j--) {  //j = col

                System.out.print("*");

            }
            System.out.println();
        }


        System.out.println("Pattern 3:");
        for (int i = 1; i <=5 ; i++) {  //i=row
            for (int j = 1; j <=i ; j++) {  //j = col

                System.out.print(j+" ");

            }
            System.out.println();
        }

        System.out.println("Pattern 4:");
        for (int i = 1; i <=9 ; i++) {  //i=row , you could consider row<=5 , then row*2-1 (== 9) for whole pattern's rows
            int totalColinThatRow = i > 5 ? 9-i+1 : i;    //int totalColinThatRow = row>5 ? 9-row+1 : row
                                               // that means, for i =6, 9-6+1 =>4, so 4 stars will be printed on row 6, and so on and on
            for (int j = 1; j <=totalColinThatRow ; j++) {  //j = col

                System.out.print("*");

            }
            System.out.println();
        }



        System.out.println("Pattern 4:a bit change in the rows/inputs");
        //lets say n = 5
        //modified and better this way!!!
        int n=8;
        for (int i = 1; i <=2*n-1 ; i++) {  //i=row ,
            int totalColinThatRow = i > n ? (2*n-1)-i+1 : i;

            for (int j = 1; j <=totalColinThatRow ; j++) {  //j = col

                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("Pattern 5:spaces");

         n=10;
        for (int i = 1; i <=2*n-1 ; i++) {  //i=row ,n= total rows required
           int totalColinThatRow = i > n ? (2*n-1)-i+1 : i;

            int spaces = n - totalColinThatRow;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=totalColinThatRow ; j++) {  //j = col
                System.out.print("*");

            }
            System.out.println();
        }



        System.out.println("Pattern 5:spaces-modified-diamond shape");

        n=10;
        for (int i = 1; i <=2*n-1 ; i++) {  //i=row ,n= total rows required
            int totalColinThatRow = i > n ? (2*n-1)-i+1 : i;

            int spaces = n - totalColinThatRow;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=totalColinThatRow ; j++) {  //j = col
                System.out.print("* ");  //putting a space after that *, will make the shape diamond!!!

            }
            System.out.println();
        }



        System.out.println("Pattern 6:");
        n=5;
        for (int i = 1; i <=n ; i++) {  //i=row

            int spaces  = n-i;
            for (int s = 1; s <=spaces ; s++) {
                System.out.print("  ");  //double space will make it more beautiful
            }
            for (int j = i; j >=1 ; j--) {  //j = col
                System.out.print(j+" ");
            }

            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println("Pattern 7:");
        n=5;
        for (int i = 1; i <=2*n-1 ; i++) {  //i=row


            int totalColinThatRow = i > n ? (2*n-1)-i+1 : i;

            int spaces  = n-totalColinThatRow;
            for (int s = 1; s <=spaces ; s++) {
                System.out.print("  ");  //double space will make it more beautiful
            }

            //first half like: 4321
            for (int j = totalColinThatRow; j >=1 ; j--) {  //j = col
                System.out.print(j+" ");
            }
            //second half like: 234
            for (int j = 2; j <=totalColinThatRow ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("Pattern 8:");
         n =4; int t=2*n;
         int originalIndex = n;
        for (int i = 0; i <=2*n ; i++) {

            for (int j = 0; j <=2*n ; j++) {
                int eachIndex =originalIndex- Math.min(Math.min(i,j),Math.min(t-i,t-j));
                System.out.print(eachIndex+" ");

            }
            System.out.println();
        }
    }
}

