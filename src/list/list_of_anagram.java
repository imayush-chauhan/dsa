package list;

import java.util.LinkedList;
import java.util.List;

public class list_of_anagram {

    static List<List<String>> hmm(String[] strs){

        int n = strs.length;

        List<List<String>> s = new LinkedList<>();

        if(n == 0){
            LinkedList<String> b = new LinkedList<>();
            b.add(strs[0]);
            s.add(b);

            return s;
        }




        LinkedList<String> b = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if(!b.contains(strs[i])){
                LinkedList<String> m = new LinkedList<>();
                m.add(strs[i]);
                for (int j = i+1; j < n; j++) {
                    if(strs[i].length() == strs[j].length()){
                        LinkedList<Character> z = new LinkedList<>();
                        LinkedList<Integer> h = new LinkedList<>();
                        int l = strs[i].length();
                        if(l == 0){
                            m.add(strs[j]);
                            b.add(strs[j]);
                        }
                        for (int k = 0; k < l; k++) {
                            if(strs[i].contains(strs[j].substring(k,k+1))){
                                if(!z.contains(strs[j].charAt(k))){
                                    z.add(strs[j].charAt(k));
                                    h.add(strs[i].indexOf(strs[j].charAt(k)));
                                    if(h.size() == l){
                                        m.add(strs[j]);
                                        b.add(strs[j]);
                                    }
                                }else{
                                    if(!h.contains(k)){
                                        h.add(k);
                                        if(h.size() == l){
                                            m.add(strs[j]);
                                            b.add(strs[j]);
                                        }
                                    }
                                }

                            }

                        }
                    }
                }
                s.add(m);
            }
        }

        return s;
    }

    public static void main(String[] args) {

        String[] s = {"hhhhu","tttti","tttit","hhhuh","hhuhh","tittt"};

        System.out.println(hmm(s));
    }

}
