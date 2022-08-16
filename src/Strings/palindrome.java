package Strings;

public class palindrome {

    static boolean hmm(String s){

        s = s.replaceAll(
                "[^a-zA-Z0-9]", "");

        if(s.length() < 2) return true;

        s = s.toLowerCase();

        int a = s.length();

        for (int i = 0; i < a/2; i++) {
            if(s.charAt(i) != s.charAt(a-1-i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "0P";

        System.out.println(hmm(s));

    }

}
