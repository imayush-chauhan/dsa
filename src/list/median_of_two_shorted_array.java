package list;

public class median_of_two_shorted_array {

    static double hmm(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n1 == 0){
            if(n2%2 == 0){
                double a = nums2[n2/2 -1];
                double b = nums2[n2/2];
                return (a + b)/2;
            }else{
                double a = nums2[n2/2];
                return a;
            }
        } else if (n2 == 0) {
            if(n1%2 == 0){
                double a = nums1[n1/2 -1];
                double b = nums1[n1/2];
                return (a + b)/2;
            }else{
                double a = nums1[n1/2];
                return a;
            }
        }

        double[] a = new double[(n1+n2)/2 + 1];

        int i = 0;
        int j = 0;

        while(i + j <= (n1 + n2)/2){

            if(i == n1){

                a[i+j] = nums2[j];
                j++;
                continue;
            }

            if(j == n2){
                a[i+j] = nums1[i];
                i++;
                continue;
            }
            if(i < n1){
                if(nums1[i] <= nums2[j]){
                    a[i+j] = nums1[i];
                    i++;
                    continue;
                }
            }

            a[i+j] = nums2[j];
            j++;

        }

        if((n1+n2)%2 == 0){
            return (a[(n1+n2)/2 -1] + a[(n1+n2)/2])/2;
        }else{
            return (a[(n1+n2)/2]);
        }

    }

    public static void main(String[] args) {

        int[] a = {1,8};

        int[] a1 = {2,3,4,5,6,7};

        System.out.println(hmm(a,a1));

    }
}
