// Find position of an element in a sorted array of infinite numbers

// input: arr[] = [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170], k = 10
// Output: 4
// Explanation: 10 is at index 4 in array.
public class InfiniteNumber {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        if(lengthfind(arr, target)>=0){
            
           System.out.println("Target value is at the index :"+lengthfind(arr, target));
        }
        else{
            System.out.println("Target Value not found");
        }

    }
    public static int lengthfind(int arr[],int target){
        int start =0;
        int end =1;
 // condition for target length
        while(target>arr[end]){
            int temp = end+1;

            // double the box value

            end = end + (end -start +1) * 2; //0,1 => 1 +(1-0 +1) *2  => 1+1 *2  => 2*2 => 4 
            start = temp;
        }
       
        return (BinarySearch(arr, start, end, target));
    }
    public static int BinarySearch(int arr[],int start, int end, int target){

        int mid ;
        while(start<=end){
           mid = start +(end- start) /2;

           if(arr[mid]==target){
           return mid;
           }
           else if(arr[mid]<target){
            start = mid+1;
           }
           else{
            end = mid-1;
           }
        }
       return -1;
    }
}
