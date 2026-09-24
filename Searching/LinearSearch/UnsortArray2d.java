// unsort Array 
// input:[ 8 3 9 
//         2 7 5 
//         4 1 6 ] 
// target = 1
public class UnsortArray2d {
    public static void main(String[] args) {
        int[][] arr = {{8 ,3,9}, 
                     {2, 7}, 
                     {4 ,1, 6}
                    };
        int target = 1;
        int row = -1;
        int colm =-1;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    row=i;
                    colm=j;
                }
            }
        }
        if(row>-1 && colm>-1){
            System.out.println("Element found at the index :["+row+"]["+colm+"]");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
