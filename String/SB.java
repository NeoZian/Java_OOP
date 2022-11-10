public class SB {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ch = (char) ('a'+i);
            builder.append(ch);   //it just adds the new elements to the previous object instead of creating a new one!
        }
        System.out.println(builder);
        //or
        System.out.println(builder.toString());

        builder.deleteCharAt(0); //deleted 'a'
        System.out.println(builder);
    }
}
