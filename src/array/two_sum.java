package array;

public class two_sum {

    static int[] hmm(int[] nums, int target){

        int n = nums.length;
        int[] a = new int[2];

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {

                if(nums[i] + nums[j] == target){
                    a[0] = i;
                    a[1] = j;
                    return a;
                }

            }

        }

        return nums;
    }

    public static void main(String[] args) {

        int[] a = {2,7,8,1};

        int target = 9;

        System.out.println(hmm(a,target));

    }

}
