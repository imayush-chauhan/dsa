package array;

import java.util.PriorityQueue;

public class sort_an_array_of_ones_and_two {

    static void hmm(int[] nums){

        int n = nums.length;

        int c0=0, c1=0, c2=0;
        for(int i=0; i<n; i++){
            switch(nums[i]){
                case 0:
                    c0++;
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
            }
        }

        int i=0;
        while(c0>0){
            nums[i++]=0;
            c0--;
        }
        while(c1>0){
            nums[i++]=1;
            c1--;
        }
        while(c2>0){
            nums[i++]=2;
            c2--;
        }



    }

    public static void main(String[] args) {

        int[] a = {0,1,0};

        hmm(a);

    }

}
