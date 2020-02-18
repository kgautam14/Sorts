/**
 * Created by kgautam on 17/02/20.
 */
public class quickSort {

    public static int counter = 0;
    public static int counterSwap = 0;



    static int partition(int arr[], int low, int high){
        int pivot = arr[high];

        int i = (low - 1);
        for(int j = low; j<high;j++){
            System.out.println("Checking if "+arr[j]+" is less than "+pivot);

            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
                counter++;
            }
        }

        swap(arr, i+1, high);
        arrDetail ad = new arrDetail();
        ad.arrDetail(arr);
        return i+1;
    }

    public static void swap(int arr[], int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        counterSwap++;

        System.out.println("Swapping " +arr[j]  +" and " +arr[i]);
    }

    static void sort(int arr[], int low, int high){

        if(low < high){
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }

//        System.out.println("Took "+counterSwap+" swaps and "+counter+" loops to sort.");


    }
}
