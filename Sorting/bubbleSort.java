package Sorting;

public class bubbleSort {
    public static void bubsrt(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0;j<arr.length-1-i; j++){
               swap(arr, j);
            }
        }
        printarr(arr);
    }

    public static void swap(int[] arr, int pos){
        if (arr[pos] > arr[pos+1]) {
            int temp = arr[pos];
            arr[pos] = arr[pos+1];
            arr[pos+1] = temp;
        }
    }

    public static void printarr(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {12,45,32,85,23};
        printarr(arr1);
        bubsrt(arr1);
    }
}
