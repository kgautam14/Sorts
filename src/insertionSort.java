/**
 * Created by kgautam on 17/02/20.
 */
public class insertionSort {
    public static void sort(int arr[]){

        int counter = 0;
        int length  = arr.length;
        for(int i = 1; i < length; i++){
            System.out.println(arr[i]+" is now Elem and "+(i-1)+" is the value of J");
            int elem = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j] > elem ){
                counter++;
                System.out.println("While arr[j] i.e. "+arr[j]+" is greater than arr[j-1] i.e. " +
                        "is "+elem);
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = elem;
        }
    }
}