package Week3;

public class Week3 {

    //Mergesort
    // the idea is to divede the array into two halves and recursivley sort each halve
    // then we merge the two halves
    // we use an aux to merge
    // copy everything to the aux and then we put them porperly back into the original array
    // so i is a[lo], j is a[mid+1] and k is the start of the original array
    // uses at ost N lg N compares and 6 lg N array accesses,
    //NOTE: in a optimized version checking a[mid] <= a[mid+1] requires only N-1 compares
    // There is a whole proof thing idk if needed or not
    // if we have a small aray then inserstion sort is used at the first if when we retrn check if its small
    //---------------------------
    // bottom-up Mergesort
    //pass thorugh the array merging arrays of sze 1, then repeat for 2,4,8, 16
    // no reucursion is needed
    // log n passes, each pass making N compares
    //--------------------------------------
    // ANY COMPARE BASED SORTING ALGORITHM MUST USE AT LEAST
    // lh(N!) ~ N lg N compares in the worst case
    //----------------------------------------------------------------
    //Quicksort
    // Shuffle the array, partitiont he array, no larger entry to the left of j, no smaller entry to the right
    // sort each piece recursivly
    // 1/2 N^2 worst case compares
    // on average compares of N distinct keys in ~2N ln N and 1/2 N ln N exchanges
    // --------------------------------------------------------
    // Duplicate keys
    // Merge with duplicate keys always uses between 1/2 N lg N and N lg N compares
    //partition the array into 3 parts 3-way partition,
    // randomized quicksort with 3 way partitioing is called entropy optimal and reduces the running time
    // from linearithmic to linear



}
