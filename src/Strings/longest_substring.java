package Strings;

import java.util.*;

public class longest_substring {

    static int hmm(String s){

        int n = s.length();

        if(n==0) return 0;

        int max = Integer.MIN_VALUE;

        HashSet<Character> l = new HashSet<>();

        int i=0;

        int j=0;

        while(i<n){
            char x = s.charAt(i);

            if(!l.contains(x)){
                l.add(x);
                i++;

                max = Math.max(max, l.size());
            }
            else{
                l.remove(s.charAt(j));
                j++;
            }

        }
        return max;
    }

    public static void main(String[] args) {

        String s = "abcdeafgh";

        System.out.println(hmm(s));

    }

}
