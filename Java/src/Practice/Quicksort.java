package Practice;

public class Quicksort {

    // best = linearithmic
    // worst = n^2
    // average = linearithmic

    public static void quickSort(int [] arr, int begin, int end){
        if(begin < end){
            int partitionIndex = partition(arr,begin,end);

            // run quicksort from begin to the left of the partition, and right of the partition
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }

    }

    public static int partition(int [] arr, int begin, int end){
        int pivot = arr[end];
        int i = (begin-1);

        // goes through the array and puts all elements
        // smaller than pivot on the left
        for(int j = begin; j < end; j++){
            if(arr[j] <= pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap the last element with whatever index
        // we stopped at (all elements further are larger)
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        // return the index of the next element
        return i+1;
    }

    public static void main(String[] args) {
        int [] arr = {20,3,2,23,14,0,7,4,6,19};
        quickSort(arr,0,arr.length-1);

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }




}
