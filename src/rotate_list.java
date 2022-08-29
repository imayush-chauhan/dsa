public class rotate_list {

    static void rotate(int[] a, int k){

        int n = a.length;

        k = k%n;

        swap(a,0,n-1);
        swap(a,0,k-1);
        swap(a,k,n-1);


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



//    static void rotate(int[] a, int k){
//
//        if(a.length < 2 || a.length == k) return;
//
//        k = k % a.length;
//
//
//        while(k != 0){
//            int t = a[a.length-1];
//            for(int i = a.length - 1; i > 0; i--){
//                a[i] = a[i-1];
//            }
//            a[0] = t;
//            k--;
//        }
//
//
//        for(int i = 0; i < a.length;i++){
//            System.out.print(a[i]);
//        }
//
//    }

//    static void rotate2(int[] nums, int k) {
//        int len=nums.length;
//        k %=len;
//        reverse(nums,0,len-1);
//        reverse(nums,0,k-1);
//        reverse(nums,k,len-1);
//    }
//    static void reverse(int[] nums,int s,int e){
//        while(s<=e){
//            int t=nums[s];
//            nums[s]=nums[e];
//            nums[e]=t;
//            s++;
//            e--;
//        }
//    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        int k = 4;

        rotate(a,k);

    }
}
