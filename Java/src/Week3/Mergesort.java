//public class Mergesort {
//    private static Comparable [] aux;
//
//
//    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
//        assert isSorted(a, lo, mid); // this is an assertion that low to mid is sorted
//        assert isSorted(a, mid+1, hi); // same assertion but from mid+1 to hi
//
//        //Issorted is a method that we wrote before check that file it returns a boolean
//
//
//        for(int k = lo; k<= hi;k++){
//            aux[k] = a[k]; // here we basically copy a to the aux
//        }
//
//        int i = lo;
//        int j = mid+1;
//        for(int k = lo; k<= hi; k++){
//            if(i>mid){ // this is when i is exhausted
//                a[k] = aux[j++];
//            }else if(j>hi){   // this is for when j is exhausted
//                a[k] = aux[i++];
//            }else if(less(aux[j], aux[i])){ // we usually start here and make the compares
//                a[k] = aux[j++];
//            }else{
//                a[k] = aux[i++];
//            }
//
//        }
//
//        assert isSorted(a,lo,hi);
//    }
//
//
//    private static void sort(Comparable[] a, Comparable [] aux, int lo, int hi){
//        if(hi <= lo){
//            return;
//        }
//
//        int mid = lo + (hi-lo)/2;
//        sort(a, aux, lo, mid);
//        sort(a,aux,mid+1,hi);
//        // this can be added to imporve
//        // if(!less(a[mid+1], a[mid])) return;
//        merge(a,aux,lo, mid,hi);
//    }
//
//    public static void sort(Comparable[] a){
//        aux = new Comparable[a.length];
//        sort(a,aux,0,a.length-1);
//    }
//}
