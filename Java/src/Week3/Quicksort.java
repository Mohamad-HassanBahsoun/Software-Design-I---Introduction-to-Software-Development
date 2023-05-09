//public class Quicksort {
//
//    private static int partition(Comparable [] a, int lo, int hi){
//        int i = lo; int j = hi+1;
//        while(true){
//            while(less(a[++i],a[lo])){ // Find item on the left to swap
//                if(i == hi) break;
//            }
//            while(less(a[lo], a[--j])){ // find item on the right to swap
//                if(j==lo) break;
//            }
//            if(i>= j) break; // check if pointers cross
//            exch(a,i,j); // swap
//        }
//        exch(a,lo,j); // swap with partitiong item
//
//        return j; // return the index of the item now known in its place
//    }
//
//    public static void sort(Comparable[] a){
//        sort(a,0,a.length-1);
//    }
//
//    private static void sort(Comparable [] a, int lo, int hi){
//        if(hi <=lo){
//            return;
//        }
//        int j = partition(a,lo,hi);
//        sort(a,lo,j-1);
//        sort(a,j+1, hi);
//
//    }
//
//
//}
