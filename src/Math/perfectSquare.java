package Math;

public class perfectSquare {
    public static void main(String[] args) {
        int n=16;
        long low=1;
        long high=n;
        while(low<=high){
            long mid=(low+high)/2;
            long square=mid*mid;
            if(square==n){
                System.out.println("True");
                return;
            }else if(square<n){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println("False");
    }
}
