//Union-Optimal Solution
import java.util.*;
public class Union {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length, m = arr2.length;
        List<Integer> res= union(arr1,arr2, n,m);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
    static  List<Integer> union(int [] arr1,int [] arr2, int n, int m){
         List<Integer> un=new ArrayList<>();
        int i=0,j=0;
        while (i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(un.isEmpty()|| un.get(un.size()-1)!=arr1[i]){
                    un.add(arr1[i]);
                }
                i++;
            } else if (arr1[i]>arr2[j]) {
                if(un.isEmpty()|| un.get(un.size()-1)!=arr2[j]){
                    un.add(arr2[j]);

                }
                j++;
            }
            else{
                if(un.isEmpty()|| un.get(un.size()-1)!=arr1[i]){
                    un.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }

        while(i<n){
            if(un.isEmpty()|| un.get(un.size()-1)!=arr1[i]){
                un.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(un.isEmpty()|| un.get(un.size()-1)!=arr2[j]){
                un.add(arr2[j]);
            }
            j++;
        }
        return un;
    }
}
