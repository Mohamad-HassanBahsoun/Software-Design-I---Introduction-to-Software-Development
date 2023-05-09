package AlgorithmsPt1.Sorts;

public class BinarySearch {
    // Assume list is already in order

    // Binary search returns whether a number is in the array or not

    public static boolean search(int [] arr, int lo, int hi, int target){

        if(hi < lo){
            return false;
        }

        int mid = (hi+lo)/2;

        if(target > arr[mid]){
            return search(arr,mid+1, hi,target);
        }else if(target < arr[mid]){
            return search(arr, lo, mid-1,target);
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,0,arr.length-1,1));
    }

}
