public class Performance {
    public static void main(String[] args) {

        String series = "";

        for (int i = 0; i <26 ; i++) {
            char ch = (char) ('a'+i);
            //System.out.println(ch);  //prints a-z
            series = series + ch;  //series+=ch ; adding all the ch to the string
        }

        System.out.println(series); //prints a-z; abcdefghijklmnopqrstuvwxyz
        //but the problem with that process is that it creates new object each time having time com: O(n^2) !!
        //so we should not do that way having that time complexity

        //solution: using just a simple object! That is called as 'String Builder'


    }
}
