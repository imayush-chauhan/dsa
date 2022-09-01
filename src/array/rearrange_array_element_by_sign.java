package array;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Stack;

public class rearrange_array_element_by_sign {

    static int[] hmm(int[] nums){

        int n = nums.length;

        int[] a = new int[n];
        int s = 0;
        int e = 1;

        for (int i = 0; i < n; i++) {

            if(nums[i] < 0){
                a[e] = nums[i];
                e = e+2;
            }else{
                a[s] = nums[i];
                s = s+2;
            }
        }

        return a;
    }

    public static void main(String[] args) {

        int[] a = {-1,1};

        System.out.println(hmm(a));

    }

}
