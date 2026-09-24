// insertion sort => Take the current element → shift larger elements → insert it in the correct position


//input:[5  3  8  1  2] 
// output:[1  2  3  4  5]

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,8,1,2,3};
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){

                 int temp = arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]= temp;
                }
            }
        }
         System.out.println(Arrays.toString(arr));
    }
}
