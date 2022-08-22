package array;

public class find_first_and_last_element {


    static int[] hmm(int[] nums, int target){

        int n = nums.length;

        if(n == 0){
            int[] m = {-1,-1};
            return  m;
        }

        int a = -1;
        int b = -1;

        for (int i = 0; i < n/2 + 1; i++) {

            if(nums[i] == target){
                if(a == -1){
                    a = i;
                }else if(i < a){
                    a = i;
                }else if(b == -1){
                    b = i;
                } else if (i > b) {
                    b = i;
                }
            }
            if(nums[n-i-1] == target){
                if(b == -1){
                    b = n-i-1;
                }else if(n-i-1 > b){
                    b = n-i-1;
                }else if(a == -1){
                    a = n-i-1;
                } else if (n-i-1 < a) {
                    a = n-i-1;
                }
            }

        }

        if(a == -1 && b != -1){
            a = b;
        } else if (b== -1 && a != -1) {
            b = a;
        }

        int[] m = {a,b};

        System.out.println(a+ " " + b);

        return m;

    }

    public static void main(String[] args) {

        int[] a = {1,2,2,3,4,4,4};

        int t = 4;

        System.out.println(hmm(a,t));


    }

}
