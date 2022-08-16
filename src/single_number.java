import java.util.*;

public class single_number {

    static int hmm(int[] nums){

        if(nums.length <= 2) return nums[0];

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i = i + 2){

            if(i < nums.length - 1){
                if(nums[i] != nums[i+1]){
                    return nums[i];
                }
            }else{
                return nums[i];
            }

        }

        return 0;
    }

    public static void main(String[] args) {

        int[] a = {2,1,1};

        System.out.println(hmm(a));
    }
}
