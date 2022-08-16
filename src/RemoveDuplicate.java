public class RemoveDuplicate {


    static int fun(int[] a, int k){

        for (int i = 1; i < a.length; i++) {

            if(a[i-1] != a[i]){
                a[k++] = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        return k;
    }

    public static void main(String[] args){

        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        int k = 1;

        System.out.print(fun(arr,k));

    }
}
