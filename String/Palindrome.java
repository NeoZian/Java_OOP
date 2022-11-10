public class Palindrome {
    public static void main(String[] args) {
        String str = "AbAbA";
        boolean ans = isPalindrome(str);
        System.out.println("Is "+str+" Palindrome? :"+ans);
    }

    static boolean isPalindrome(String str){

        str = str.toLowerCase(); // to make it case-insensitive
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
