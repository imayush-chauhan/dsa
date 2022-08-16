package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class anagram {

    static boolean hmm(String s, String t){

        if(s.length() != t.length()) return false;

        int n = s.length();

        List<Character> s1 = new ArrayList<>();
        List<Character> t1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s1.add(s.charAt(i));
            t1.add(t.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            if(t1.contains(s1.get(0))){
                t1.remove(s1.get(0));
                s1.remove(0);
            }else{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "anaggram";
        String t = "nagagram";

        System.out.println(hmm(s,t));

    }

}
