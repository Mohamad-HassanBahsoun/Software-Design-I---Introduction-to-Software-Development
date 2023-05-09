package AlgorithmsPt1.Practice;

public class InsertionSort {

    public static void sort(int [] arr){

        for(int i = 0; i < arr.length;i++){
            for(int j = i; j > 0; j--){
                if(arr[j]< arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {4,7,9,2,3,8,0,1};
        sort(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
