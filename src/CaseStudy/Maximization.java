package CaseStudy;

public class Maximization {
    public static void main(String[] args) {
        int arr[]={4,3,1,5,6};
       int ans= solve(arr);
        System.out.println(ans);
    }
    static int solve(int[] arr){
        int max=0;
        int sum;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            sum=arr[i]+arr[i+1];
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
}
