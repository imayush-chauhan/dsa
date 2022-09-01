package array;

import java.util.PriorityQueue;

public class longest_consuctive {

    static int hmm(int[] nums){

        int n = nums.length;

        int ans = 1;
        int num = 1;

        PriorityQueue<Integer> a = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            a.add(nums[i]);
        }

        int p = a.peek();
        a.poll();

        for (int i = 0; i < n-1; i++) {
            System.out.print(a.peek() + " " + i + " ");
            int j = a.peek();
            if(p + 1 == j){
                num++;
                if(num > ans){
                    ans++;
                    System.out.print(ans + " ");
                    System.out.println(a.peek());
                }
            }else{
                num = 0;
            }
            p = a.poll();
            System.out.println();
        }



        return ans;
    }

    public static void main(String[] args) {

        int[] a = {0,3,7,2,5,8,4,6,0,1};

        System.out.println(hmm(a));

    }

}
