public class reverse_int {

//    static void rev(int a){
//
//        while( a % 10 == 0){
//            a = a/10;
//        }
//
//        int n = a;
//        int k = 0;
//
//        while( n > 0){
//            n = n/10;
//            k++;
//        }
//
//        int ans = 0;
//        int p = 0;
//        int m = a;
//
//        while(k != 0){
//            k--;
//            ans = ans + (pow(10,p) * m/pow(10,k));
//            m = m - pow(10,k);
//            p++;
//        }
//
//        System.out.println(ans);
//
//    }

    static int pow(int a, int b){
        int t = 1;
        for (int i = 0; i < b; i++) {
            t = t*a;
        }
        return t;
    }

    static int hmm(int x){

        if(x < 10 && x > -10) return x;

        boolean neg = false;
        if( x < 0){
            x = -x;
            neg = true;
        }

        while( x % 10 == 0){
            x = x/10;
        }

        int n = x;
        int k = 0;

        while( n > 0){
            n = n/10;
            k++;
        }

        int m = x;
        x = 0;

        while( k != 0){
            k--;
            x = x + (m%10 * pow(10,k));
            if(x > 214748364) {
                return 0;
            }
            m = m/10;
        }

        if(!neg){
            return x;
        }else{
            return -x;
        }

    }

    static int hmm2(int x){
        int ans=0;
        while(x!=0){

            if(Math.abs(ans)>214748364){
                return 0;
            }

            //actual logic
            int rem=x%10;
            ans=ans*10+rem;
            x=x/10;

        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 2147483647;

//        System.out.println(pow(-2,31));

        System.out.println(hmm2(a));
    }
}
