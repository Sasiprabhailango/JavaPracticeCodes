// Each rows only sorted -> Binary Search
// input : [ 1  5  8  12 
//           3  4  9  15 
//           2  7  10 20 ]
public class EachrowSort {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 8, 12},
                       {3, 4, 9, 15},
                       {2, 7, 10,20}};
        int target = 9;
        int flag = 0;
        for(int i =0; i<arr.length;i++){
            int left =0;
            int right=arr[i].length-1;

            while(left<=right){
                int mid = left +(right-left) /2;
                if(arr[i][mid] == target){
                      System.out.println("Element at the position :["+ i +"]["+ mid +"]");
                      flag=1;
                      break;
                }
                else if(arr[i][mid] <target){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            if(flag == 1){
                break;
            }
        }
        if(flag==0){
            System.out.println("Element not found");
        }
    }
}
