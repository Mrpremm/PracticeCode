// Better Solution Using HashMap
import java.util.*;
public class twosum01 {
    public  static void main(String[] args){
        int [] arr={4,7,1,9};
        int target=8;
        String res=twosumexist(arr,target);
        System.out.println(res);
        int [] result= twoSumIndices(arr,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] twoSumIndices(int[] arr,int target){
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp=target-arr[i];
            if(freq.containsKey(comp)){
                return new int[] {freq.get(comp),i};
            }
            freq.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    static String twosumexist(int [] arr,int target){
        HashMap<Integer,Integer> freq= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int comp=target-arr[i];
            if(freq.containsKey(comp)){
                return "Yes";
            }
                freq.put(arr[i],i);

        }
        return "NO";
    }
}
