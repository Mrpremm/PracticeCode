package Array;

import java.util.*;
public class subArraySum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int key=sc.nextInt();
        int arr[] =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int ans=subSum(arr,key);
        System.out.println(ans);
    }

    static int subSum(int[] arr,int key){
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            int rem=sum-key;
            if(mp.containsKey(rem)){
                count=count+mp.get(rem);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);

        }
        return count;

    }
}
