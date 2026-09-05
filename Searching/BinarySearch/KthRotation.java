// Find the value of k the number of times the array was right-rotated from its originally sorted form.

// Input: arr[] = [15, 18, 2, 3, 6, 12]
// Output: 2
// Explanation: 
// Original sorted array = [2, 3, 6, 12, 15, 18]
// After 2 right rotations → [15, 18, 2, 3, 6, 12]  
public class KthRotation {
    public static void main(String[] args) {
        
        int[] arr = {15, 18, 2, 3, 6, 12};

        // 0(n) normal method

        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]<arr[0]){
        //         System.out.println("Rotation Count:"+i);
        //         break;
        //     }
        // }

      
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start) /2;
            if(arr[mid]>arr[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        System.out.println("Rotation Count:"+start);
    }
}
