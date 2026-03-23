//A distributed computing grid contains N processing units. Each unit consumes resources represented
//by array arr[].
//You must determine whether it is possible to partition the array into two subsets such that the sum
//of elements in both subsets is equal.
//        Return:
//        • 1 if such a partition exists
//• 0 otherwise
//Constraints:
//        • 1 ≤ N ≤ 100
//        • 1 ≤ arr[i] ≤ 1000
//        • N × sum(arr[i]) ≤ 5 × 10^6
//Test Cases
//Input
//        N = 4
//arr = [1, 5, 11, 5]
//Output
//1
//Input
//        N = 3
//arr = [1, 3, 5]
//Output
//0


        package CaseStudy;

public class subsetProblem {
    public static void main(String[] args) {
        int [] arr={1, 5, 11, 5};
        int ans=solve(arr);
        System.out.println(ans);

    }
    static int solve(int [] arr){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        if(sum%2!=0) return 0;
        int target=sum/2;
        boolean[] dp=new boolean[target+1];
        dp[0]=true;
        for (int i=0;i<n;i++){
            int num=arr[i];
            for (int j=target;j>=num;j--){
            if(dp[j-num]==true){
                dp[j]=true;
            }
            }
        }
        if(dp[target]==true){
            return 1;
        }else {
            return 0;
        }
}
}
