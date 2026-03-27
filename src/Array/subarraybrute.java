//import java.lang.annotation.Target;
//
//What are Subarrays with a given Sum?
//Let’s understand the concept of subarray with Examples:
//arr[] = [ 3, 4 , -7, 1, 3, 3, 1, -4]
//Target value = 7
//Subarray with sum equals to:
//        7 + 4 = 7 → so [3,4] is a valid subarray
//3 + 4 - 7 + 1 + 3 + 3 = 7 → so [3,4,-7,1,3,3] is also valid subarray
//1 + 3 + 3 = 7 → so [1,3,3], also a valid answer.
//        3 + 3 + 1 = 7 → so [3,3,1] also a valid subarray
package Array;

public class subarraybrute {
    public static void main(String[] args) {
        int [] arr={3, 4 , -7, 1, 3, 3, 1, -4};
        int target=7;
        int n=arr.length;
        for(int i=0;i<n;i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum == target) {
                    printsub(arr, i, j);
                }
            }
        }
    }
    static void printsub(int [] arr, int start,int end){
        System.out.print("[");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
}
