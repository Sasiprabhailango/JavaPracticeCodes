// Linear Search

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                   arr[i] = sc.nextInt();
            }
            
            int target = sc.nextInt();
            int value = -1;

            for (int i = 0; i < n; i++) {
                      if(arr[i] == target){
                        value =i;
                        break;
                      }
            }
            if(value>=0){
                System.out.println("Target value is found at the indexValue:"+value);
            
            }
           else{
            System.out.println("Target value is not found");
           }

        }
    }
}
