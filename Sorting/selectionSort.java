package Sorting;

public class selectionSort {
    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void swap(int[] arr, int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void selctinsrt(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int least = i;
            for(int j=i+1; j<arr.length; j++ ){
                if (arr[least] > arr[j]) {
                    least = j;
                }
            }

            if (i!=least) {
                swap(arr, i, least);
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] myArray = {3,6,5,2,1,8,4,9,7};
        System.out.println("\nBefore sorting");
        printArray(myArray);

        System.out.println("\nAfter sorting");
        selctinsrt(myArray);

    }
}
