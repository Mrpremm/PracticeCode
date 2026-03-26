package Array;

import java.util.HashSet;

public class Intersection02 {
    public static void main(String[] args) {
        int arr1[]={4,9,6,7};
        int arr2[]={9,4,9,8,4};

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            int num=arr2[i];
            if(set.contains(num)){
                res.add(num);
            }
        }
        System.out.println(res);
    }
}
