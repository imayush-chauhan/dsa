package array;

import java.util.HashMap;

public class majorty_element {

    static int hmm(int[] nums){

        int n = nums.length;

        int m =0,ans=0;

        HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();

        for (int i = 0; i < n; i++) {
            a.put(nums[i], a.getOrDefault(nums[i], 0) + 1);
            int p = a.get(nums[i]);
            if(p > m){
                m = p;
                ans = nums[i];
            }
        }

        System.out.println(a);

        return ans;
    }

    public static void main(String[] args) {

        int[] a = {2,2,1,1,1,2,2};

        System.out.println(hmm(a));

    }

}
