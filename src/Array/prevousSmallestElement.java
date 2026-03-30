package Array;

public class prevousSmallestElement {
    public static void main(String[] args) {
        int arr[]={4, 5, 2, 10};
        int n=arr.length;
        int [] arr1=new int[n];
        arr1[0]=-1;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                arr1[i]=arr[i-1];
            }else{
                arr1[i]=-1;
            }
        }
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.print("]");
    }
}
