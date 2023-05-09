package AlgorithmsPt1.Sorts;

public class SelectionSort {

    public static void sort(int [] arr){

        for(int i = 0; i < arr.length;i++){
            int min = i;
            for(int j= i;j< arr.length;j++){
                if(arr[j]< arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int [] a = {9,4,6,2,3,1,5,10,8};
        sort(a);
        System.out.println(" ");
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }
}
