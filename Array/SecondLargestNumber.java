// Find the second largest number without sort 
//Input:  [10, 5, 20, 8, 15] Output: 15

import java.util.*;
public class SecondLargestNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
               int n = sc.nextInt();
               int[] arr = new int[n];
               int max=0;
               for (int idx = 0; idx < arr.length; idx++) {
                    arr[idx] = sc.nextInt(); 
                    if(max<arr[idx]){
                        max=arr[idx];
                    }
               }
               int secondMax=0;
               for (int idx = 0; idx < arr.length; idx++) {
                   if(arr[idx]!=max && (arr[idx]>secondMax)){
                    secondMax =arr[idx];
                   }  
               }
             System.out.println("Second Largest value :"+secondMax);

               
        }
    }
}
