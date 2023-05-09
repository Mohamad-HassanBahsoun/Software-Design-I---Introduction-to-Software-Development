package Practice;

public class Mergesort {

    //Always linearithmic

    public static void mergeSort(int [] arr, int n){

        if(n < 2){
            return;
        }

        //Begin to split the array into two halves
        int mid = n/2;

        int [] arrL = new int [mid];
        int [] arrR = new int [n-mid];

        // copy the left to a new array
        for(int i = 0; i< mid; i++){
            arrL[i] = arr[i];
        }
        // copy the right to a new array
        for(int i = mid; i< n; i++){
            arrR[i-mid] = arr[i];
        }

        mergeSort(arrL, mid);
        mergeSort(arrR, n-mid);

        merge(arr, arrL, arrR, mid, n-mid);

    }

    public static void merge(int [] arr, int [] arrL, int [] arrR, int left, int right){
        int i = 0, j = 0, k = 0;

        while(i<left && j < right){
            if(arrL[i] <= arrR[j]){
                arr[k++] = arrL[i++];
            }else{
                arr[k++] = arrR[j++];
            }
        }
        // This if for if the right array finishes before the left then we copy the rest into arr
        while (i<left){
            arr[k++] = arrL[i++];
        }
        // This if for if the left array finishes before the left then we copy the rest into arr
        while (j<right){
            arr[k++] = arrR[j++];
        }

    }

    public static void main(String[] args) {
//        int [] arr = {5,3,8,0,1};
//        mergeSort(arr, arr.length);
//
//        for(int i = 0; i< arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//        System.out.println(5/2);

        int x1 = 10;
        int x0 = 0;
        while(x1>=0){
            x1--;
            x0+=2;
        }
        System.out.println(x0);

    }
}
