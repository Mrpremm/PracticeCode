//Optimal Solution
//Byy Using Reverse method

public class Rotate_2 {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6};
        int d=3;
        int n=arr.length;
        d=d%n;
        rotate(arr,d,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static  void rotate(int [] arr, int d, int n){
        reverse(arr,0,d-1);
        reverse(arr, d, n-1);
        reverse(arr,0,n-1);

    }
    static  void reverse(int [] arr, int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
