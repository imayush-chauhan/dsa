package array;

public class maxmimun_subarray {

    static int hmm(int[] nums){

        int sum = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if(sum + nums[i] > nums[i]){
                sum = sum + nums[i];
            }else{
                sum = nums[i];
            }

            if(sum > ans){
                ans = sum;
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        int[] a ={-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(hmm(a));

    }

}
