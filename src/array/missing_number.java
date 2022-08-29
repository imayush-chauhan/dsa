package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class missing_number {

    static int hmm(int[] nums){

        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if(nums[i] != i){
                return i;
            }
        }

        return n+1;
    }

    static int hmm2(int[] nums){

        int n = nums.length;

        HashMap<Boolean,Integer> a = new HashMap<>();

        for (int i = 0; i < n; i++) {
            a.putIfAbsent(false,i);
            a.put(true,nums[i]);
        }



        return n;
    }

    public static void main(String[] args) {

        int[] a = {3,0,1};

        System.out.println(hmm2(a));


    }

}
