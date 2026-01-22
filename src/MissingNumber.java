public class MissingNumber {
    public static void main(String[] args){
        int arr[]={ 1,2,3,5};
        int N=5;
        int res=finding(arr,N);
        System.out.println(res);
    }
    static int finding(int[] arr,int N){
        int n=arr.length;
        int xor1=0,xor2=0;
        for(int i=0;i<n;i++){
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^N;
        return xor1 ^xor2;
    }
}
