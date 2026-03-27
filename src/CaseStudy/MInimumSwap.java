package CaseStudy;

public class MInimumSwap {
    public static void main(String[] args) {
        int [] arr={2, 7, 9, 5, 8, 7, 4};
        int k=5;
        int ans=solve(arr,k);
        System.out.println(ans);
    }
    static int solve(int [] arr, int k){
        int good=0; //Window size mil ajeyga
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k) good++;
        }
        int bad=0;
        for(int i=0;i<good;i++){
            if(arr[i]>k) bad++;
        }
        int minswap=bad;
        int i=0;
        int j=good;
        while(j<arr.length){
            if(arr[i]>5) bad--;
            if(arr[j]>5) bad++;
            minswap=Math.min(minswap, bad);
            i++;
            j++;
        }
        return minswap;
    }
}
