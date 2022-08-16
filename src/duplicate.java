import java.util.*;

public class duplicate {

    static boolean hmm(int[] nums){

        for (int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }

    static boolean hmm2(int[] nums){

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return nums.length != set.size();

    }

    public static void main(String[] args) {

        int[] a = {1,2,3,1};

        System.out.println(hmm2(a));
    }

}
