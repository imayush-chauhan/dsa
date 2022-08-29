package array;

public class originaly_sorted {

    static int[] rotate(int[] a, int k){

        int n = a.length;

        swap(a,0,n-1);
        swap(a,0,k-1);
        swap(a,k,n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        return a;
    }

    static void swap(int[] a, int s,int e){
        while (s <= e){
            int t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++;
            e--;
        }
    }

    static boolean hmm(int[] nums){

        int m = nums.length;
        int z = 0;

        for (int j = 0; j < m - 1; j++) {
            if(nums[j] > nums[j+1]){
                j = -1;
                z = z+1;
                if(z == m){
                    return  false;
                }
                rotate(nums, 1);

            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] a = {3,4,5,1,2};

        System.out.println(hmm(a));

    }

}
