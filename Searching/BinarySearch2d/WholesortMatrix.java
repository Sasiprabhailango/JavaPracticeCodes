// Whole sorted Matrix ->Binary search whole matrix
// input :[ 1  3  5  7 
//          10 11 16 20      ====>[1 3 5 7 10 11 16 20 23 45 76]
//          23 30 45 76]
// target : 45
public class WholesortMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,  3,  5,  7},
                       {10, 11, 16, 20},
                       {23, 30, 45, 76}
                    };
        int target = 45;
       
        int rows = arr.length;
        int colms = arr[0].length;

        int left = 0;
        int right = rows*colms -1; // 3*4 = 12 -1 

        int flag = 0;
        while(left<=right){
            int mid = left+(right-left) /2;    // 3 -(11-3) /2  =>  5/2 => 2

           int  row = mid/colms;    // 2/4
            int colm = mid%colms; 

            if(arr[row][colm] == target){
                System.out.println("Element at the index :["+ row +"]["+ colm +"]");
                flag=1;
                break;
            }
            else if(arr[row][colm]<target){
                left = mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(flag==0){
            System.out.println("Element not found");
        }

    }
}
