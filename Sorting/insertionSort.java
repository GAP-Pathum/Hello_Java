package Sorting;

public class insertionSort {

    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void insrtsrt(int[] arr){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] myArray = {25,65,15,48,56,12,36};
            printArray(myArray);
            insrtsrt(myArray);
            printArray(myArray);
    }
}
