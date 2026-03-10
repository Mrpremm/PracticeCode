//Question:Given an array of integers, find an index such that the sum of elements
//at lower indexes is equal to the sum of elements at higher indexes.
//If no such index exists, return -1.
//
//For example, consider the array [-7, 1, 5, 2, -4, 3, 0] Index 3 is an
//equilibrium index because the sum of elements on the left, -7+1+5=-1,
//is equal to the sum of elements on the right, -4+3+0=-1
package Array;
import java.util.*;
public class EquilibriumArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Equal(arr));
    }
    static int Equal(int[]arr){
        int n=arr.length;
        //Code
        int ls=0;
        int rs;
        int total=0;
        for(int i=0;i<n;i++) total+=arr[i];
        for(int i=0;i<n;i++){
            rs=total-ls-arr[i];
            if(rs==ls) return i;
            ls=ls+arr[i];
        }
        return-1;
    }
}
