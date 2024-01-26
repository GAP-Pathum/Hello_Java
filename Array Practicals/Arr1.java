public class Arr1{
public static void main(String[] args) {
    int[] myarray = new int[5];
    myarray[0]=10;
    myarray[1]=20;
    myarray[2]=30;
    myarray[3]=40;
    myarray[4]=50;

    traversal(myarray);
    insertion(myarray, 3, 45);
    update(myarray, 3, 45);
    search(myarray, 40);
    delete(myarray, 2);

}

    public static void traversal (int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void update (int[] arr, int index, int element){
        arr[index] = element;
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void insertion (int[] arr, int index, int element){
        for(int i=arr.length-1; i>=index; i-- ){
            arr[i]=arr[i-1];
        }
        arr[index] = element;
        for(int j:arr){
            System.out.print(j+" ");
        }
        System.out.println();
    }

    public static void search (int[] arr, int element){
        for(int i=0; i<=arr.length; i++){
            if(arr[i]==element){
                System.out.println("Element found");
            }
        }
        System.out.println();
    }

    public static void delete (int[] arr, int index){
        for(int i=index; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        for(int j:arr){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}