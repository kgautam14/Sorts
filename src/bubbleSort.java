/**
 * Created by kgautam on 17/02/20.
 */
public class bubbleSort {

    public static void sort(int arr[]){

        int length = arr.length;

        for(int i =0; i< length-1; i++){
            for(int j = 0 ; j<length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    quickSort.swap(arr, j, j+1);
                }
            }
        }

    }
}
