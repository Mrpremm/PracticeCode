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
