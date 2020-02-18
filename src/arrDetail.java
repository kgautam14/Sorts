/**
 * Created by kgautam on 17/02/20.
 */
public class arrDetail {

    public static void arrDetail(int arr[]){

        int length = arr.length;
        System.out.println("Here is your array : ");
        for (int i = 0; i<arr.length; i++){
            if( i == length - 1){
                System.out.print(arr[i]+"\n");
            }
            else
                System.out.print(arr[i]+", ");
        }
    }
}
