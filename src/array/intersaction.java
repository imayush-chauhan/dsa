package array;

import java.util.HashMap;
import java.util.LinkedList;

public class intersaction {

    // not fast not storage effective

    static int[] hmm2(int[] nums1, int[] nums2){

        int n1 = nums1.length;
        int n2 = nums2.length;

        LinkedList<Integer> h = new LinkedList<>();

        if(n1 <= n2){
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < n2; j++) {
                    if(nums1[i] == nums2[j] && !h.contains(nums1[i])){
                        h.add(nums1[i]);
                        continue;
                    }

                }
            }
        }else{
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < n1; j++) {
                    if(nums1[j] == nums2[i] && !h.contains(nums1[j])){
                        h.add(nums1[j]);
                        continue;
                    }
                }
            }
        }

        int l = h.size();

        int[] a = new int[l];

        for(int i = 0; i < l; i++){
            a[i] = h.get(i);
        }

        return a;
    }

    // fast, storage effective

    static int[] hmm(int[] nums1, int[] nums2){

        int n1 = nums1.length;
        int n2 = nums2.length;

        int n;

        if(n1 >= n2){
            n = n1;
        }else{
            n = n2;
        }

        HashMap<Integer,Boolean> h1 = new HashMap<>();
        HashMap<Integer,Boolean> h2 = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if(i < n1 && !h1.containsKey(nums1[i])){
                h1.put(nums1[i], false);
            }


            if(i < n2 && !h2.containsKey(nums2[i])){
                h2.put(nums2[i], false);
            }


            if(i < n1 && h2.containsKey(nums1[i])){
                h2.replace(nums1[i], true);
                h1.replace(nums1[i], true);
            }


            if(i < n2 && h1.containsKey(nums2[i])){
                h1.replace(nums2[i], true);
                h2.replace(nums2[i], true);
            }

        }

        int l = 0;

        for (Integer key: h1.keySet()) {
            if(h1.get(key)){
                l++;
            }
        }

        int[] a = new int[l];

        int m = 0;

        for (Integer key: h1.keySet()) {
            if(h1.get(key)){
                a[m] = key;
                System.out.println(a[m]);
                m++;
            }
        }

        return a;
    }

    public static void main(String[] args) {

        int[] a = {4,5,9};

        int[] b = {5,4};

        System.out.println(hmm2(a,b));

    }

}
