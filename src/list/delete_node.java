package list;

import java.util.ArrayList;
import java.util.List;

public class delete_node {

    static List hmm(List<Integer> list,int k){

        list.remove(list.indexOf(k));

        return list;
    }

    public static void main(String[] args) {

        List<Integer> set = new ArrayList<>();
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(9);

        int k = 5;

        System.out.println(hmm(set,k));

    }
}
