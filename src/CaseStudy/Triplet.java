package CaseStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplet {
    public static void main(String[] args) {
        int arr[]={-1, 0, 1, 2, -1, -4};
        solve(arr);
    }
    static void solve(int[] arr){
        Arrays.sort(arr);
        List<   List<Integer>> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            if(i>0&&arr[i]==arr[i-1]) continue;
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(sum==0){
                    list.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    while(i<r && arr[l]==arr[l+1]) l++;
                    while(i<r && arr[r]==arr[l-1]) r--;
                    l++;
                    r--;
                }else if(sum<0){
                    r--;
                }else {
                    l++;
                }
            }
        }
        System.out.println(list);
    }
}
