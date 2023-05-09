package Week4;

public class Heapsort {
    private static Comparable[] pq;
    private static int N;

    public static void sink(int k){
        while(2*k <= N){
            int j = 2*k;
            if(j < N && less(j, j+1)) j++;
            exch(k,j);
            k=j;
        }
    }
    private static boolean less(int i, int j){
        return pq[i].compareTo(pq[j])<0;
    }
    private static void exch(int i, int j){
        Comparable t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }


    public static void sort(Comparable[] pq){
        int N = pq.length;
        for(int k = N/2;k>=1;k--){
            sink(k);
        }
        while (N>1){
            exch(1,N);
            --N;
            sink(1);
        }

    }
}
