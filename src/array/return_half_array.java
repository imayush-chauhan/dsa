package array;

import java.util.*;

public class return_half_array {

    static int hmm(int[] arr){

        int n = arr.length;

        LinkedList<Integer> a = new LinkedList<>();
        int[] z = new int[n];

        for (int i = 0; i < n; i++) {
            if(!a.contains(arr[i])){
                a.add(arr[i]);
                z[i] = 1;
            }else{
                int p = a.indexOf(arr[i]);
                int k = z[p];
                k++;
                if(k >= n/2){
                    return  1;
                }
                z[p] = k;
            }
        }

        Arrays.sort(z);

        System.out.println(n);

        for (int i = n-1; i >= 0; i--) {
            System.out.println(z[i]);
        }

        int l = 0;

        for (int i = n - 1; i >= 0; i--) {
            if(z[i] + l >= n/2){
                return n-i;
            }else{
                l += z[i];
            }
        }

        return 0;
    }

    static int hmm2(int[] arr){

        Map<Integer,Integer> h = new HashMap<>();

        for(int i:arr)
            h.put(i,h.getOrDefault(i,0)+1);

        if(h.size() == 1) return 1;

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        int i=0,sum=0;
        int n=arr.length/2;
        for(int j:h.values())
            pq.add(j);
        while(sum<n)
        {
            sum+=pq.poll();
            i++;
        }
        return i;
    }

    public static void main(String[] args) {

//        int[] a = {9,77,63,22,92,9,14,54,8,38,18,19,38,68,58,19};
//
//        int[] a = {1,1,1,1,1,1};

        int[] a  = {55,58,60,66,99,90,92,54,11,47,43,12,94,2,83,31,81,1,55,86,51,75,2,23,51,18,5,84,94,5,11,31,27,81,33,34,1,42,79,80,3,22,85,53,21,47,10,35,77,100,9,3,28,93};

        System.out.println(hmm2(a));

    }

}
