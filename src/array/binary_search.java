package array;

public class binary_search {

    static int hmm(int[] nums, int target){

        int s = 0;
        int e = nums.length-1;
        while (s <= e){
            int mid = (s+e)/2;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] a = {-1,0,3,5,9,12};

        int t = 12;

        System.out.println(hmm(a,t));

    }

}
