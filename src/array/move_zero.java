package array;

import java.util.HashMap;
import java.util.LinkedList;

public class move_zero {

    static void hmm2(int[] nums){

        int n = nums.length;
        int s = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] != 0){
                int t = nums[s];
                nums[s] = nums[i];
                nums[i] = t;
                s++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
        }


    }

    static int[] hmm(int[] nums){

        int n = nums.length;

        LinkedList<Integer> a = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if(nums[i] != 0){
                a.add(nums[i]);
            }
        }

        int m = a.size();

        for (int i = 0; i < n; i++) {
            if(i < m){
                nums[i] = a.get(i);
            }else{
                nums[i] = 0;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] a = {0,1,0,3,12};

        hmm2(a);

    }



}
