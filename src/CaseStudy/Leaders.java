//Given an integer array nums, return a list of all the leaders in the array.
//A leader in an array is an element whose value is strictly greater than all elements to its right
//in the given array. The rightmost element is always a leader. The elements in the leader array
//must appear in the order they appear in the nums array.
//        Examples:
//Input: nums = [1, 2, 5, 3, 1, 2]
//Output: [5, 3, 2]
//Explanation: 2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is
//the largest element in the index range [2, 5]
//Input: nums = [-3, 4, 5, 1, -4, -5]
//Output: [5, 1, -4, -5]
//Explanation: -5 is the rightmost element, -4 is the largest element in the index range [4, 5], 1
//is the largest element in the index range [3, 5] and 5 is the largest element in the range [2, 5]

package CaseStudy;

import java.util.*;
public class Leaders {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ans=findleader(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }

    static ArrayList<Integer> findleader(int [] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        ans.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
            }
        }

        Collections.reverse(ans);
        return ans;
    }
}
