//Optimal Solution -2 pointer in intersection between 2 sorted array
import java.util.*;

public class Intersection {
    public static void main(String[] args){
       int arr1[]={1,2,2,3,3,4,5,6};
       int arr2[]={2,3,3,5,6,6,7};
       int n=arr1.length;
       int m=arr2.length;
       List<Integer> res=Inter(arr1,arr2,n,m);
       for(int i=0;i<res.size();i++){
           System.out.print(res.get(i)+" ");
       }

    }
    static List<Integer> Inter(int []arr1,int [] arr2, int n,int m){
        List<Integer> inter=new ArrayList<>();
        int i=0,j=0;
        while(i<n &&j<m){
            if(arr1[i]<arr2[j]){
                i++;

            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                inter.add(arr2[j]);
                i++;
                j++;
            }
        }
        return inter;
    }
}
