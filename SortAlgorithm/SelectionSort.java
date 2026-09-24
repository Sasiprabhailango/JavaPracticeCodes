
//    Find the smallest element → put it at the beginning.
//       or Find the largest element → put it at the end. 
//  input:[5  3  8  1  2] 
// output:[1  2  3  4  5]

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,3,1};

      for(int i=0;i<arr.length-1;i++){

        int max = arr[i];
        int position = i; 
        for(int j=i+1;j<arr.length;j++){
        if(max>arr[j]){
                max = arr[j];
                position =j;
            }
        }
        arr[position] = arr[i];
        arr[i]=max;
      }
       System.out.println(Arrays.toString(arr));
     
    }
    
}
