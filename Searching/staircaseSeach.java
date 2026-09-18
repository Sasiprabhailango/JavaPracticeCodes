
//  The staircase search ( Each row → ascending  Each column → ascending )

//  input :[1   4   7
//          2   5   8
//          3   6   9]

// Then, starting from the top-right, you can decide:

// current < target → move down
// current > target → move left

public class staircaseSeach {
    public static void main(String[] args) {
        
        int arr[][] = {
            { 1, 4, 7},
            { 2, 5, 8},
            { 3, 6, 9}
        };
        int target = 6;
        int r = 0;
        int c = arr.length-1;
        int p=0;
        while(r<= arr.length && c>=0){
            if(arr[r][c] == target){
                System.out.println("Element at the index:["+ r +"]["+ c +"]");
                p=1;
                break;
                
            }
            else if(arr[r][c] <target){
                r++;
            }
            else{
                c--;
            }
        }
        if(p==0){
        System.out.println("Element not found");
        }
    }
}
