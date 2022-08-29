package array;

public class sub_array_of_equal_k {

    static int hmm(int[] nums,int k){

        int n = nums.length;

        int l =0;

        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = i; j < n; j++) {
                s += nums[j];
                if(s == k){
                    l++;
                }
            }
            if(s == 0){
                l = (int) Math.pow(2,n);
            }
        }

        return l;
    }

    public static void main(String[] args) {

        int[] a = {1,1,1,1};

        int k = 2;

        System.out.println(hmm(a,k));

    }

}
