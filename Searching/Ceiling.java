// arr [1,2,4,5,7,9,10] target = 5 if target value find print target value else smallest of the greater number 
// Find the ceiling number( smallest number greater than target element )

import java.util.*;
public class Ceiling {
    public static void main(String[] args) {
        //  ats code 

       try( Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
         arr[idx] = sc.nextInt();
        }
        Arrays.sort(arr);
        int target = sc.nextInt();
         int value = 0;

        // using normal
       
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx] >= target){
                 value = arr[idx];
                 break;
            }
        }
         System.out.println("Normal code :"+value);
        
        // using binary search
         
        int start =0;
        int end = arr.length -1;
        int mid ;
        while(start<=end){
            mid = start +(end-start) / 2;
            if(arr[mid] == target){
                value = arr[mid];
                break;
            }
            else if(arr[mid]<target){
                start = mid+1;
                
            }
            else{
              value = arr[mid];
              end = mid-1;
            }
        }
      System.out.println("Binary code :"+value);
        
      }


    }
    
}
