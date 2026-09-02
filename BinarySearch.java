// Binary search
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int idx = 0; idx < arr.length; idx++) {
                arr[idx] = sc.nextInt();   
            }
            int target = sc.nextInt();
            int value = 0;
            int start = 0;
            int end = n-1;
            int mid;
            while(start<=end){
                mid = start +(end-start) /2;
                if(arr[mid] == target){
                    value = mid;
                    break;
                }
                else if(arr[mid]>target){
                     end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
          System.out.println("Binary Search :" +value);
        }
    }
}
