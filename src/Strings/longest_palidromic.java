package Strings;

import java.util.HashMap;

public class longest_palidromic {

    static String hmm(String s){

        int n = s.length();
        if(n == 1) return s;
        int i = 0;
        int j = n - 1;

        while(i < n - 1){

            if(s.charAt(i) == s.charAt(j)){
                return s.substring(i,j+1);
            }else{
                if(j-1 != i){
                    j--;
                }else{
                    i++;
                    j = n-1;
                }
            }

        }

        return s.substring(0,1);
    }


    public static void main(String[] args) {

        String s = "ac";

        System.out.println(hmm(s));

    }
}
