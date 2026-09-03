// find the floor of number (greater number smallest than target)
// normal and binary codes 

import java.util.*;
public class Floor {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

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
            if(arr[idx]<=target){
                value = arr[idx];
            }
        }

        System.out.println(" normal code using "+value);
 
       // using binary search 

       int start = 0;
       int end = n-1;
       int mid;

       while(start<=end){
          
        mid = start +(end - start) / 2;

        if(arr[mid]== target){
            value = arr[mid];
            break;
        }
        else if (arr[mid]<target){
           
             value = arr[mid];
            start = mid+1;
        }
        else {
            end = mid-1;
        }
       }

        System.out.println("Binary code :"+value); // return start;
       }
    }
    
}
