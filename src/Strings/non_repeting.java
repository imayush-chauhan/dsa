package Strings;

import java.util.ArrayList;
import java.util.List;

public class non_repeting {

    static int hmm(String s){

        if(s.length() < 2) return 0;

        List<Character> set = new ArrayList<>();
        List<Boolean> setI = new ArrayList<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                setI.add(true);
            }else{
                setI.set(set.indexOf(s.charAt(i)),false);
            }
        }

        if(setI.indexOf(true) == -1) return -1;

        return s.indexOf(set.get(setI.indexOf(true)));
    }

    public static void main(String[] args) {

        String s = "aabb";

//        System.out.println(s.charAt(s.length() - 1));
        System.out.println(hmm(s));


    }
}
