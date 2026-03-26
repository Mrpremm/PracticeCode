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
