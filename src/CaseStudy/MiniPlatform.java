//In the futuristic city of Metron, trains operate with military precision. However, due to a surge in
//        travel, the railway authority must determine the minimum number of platforms required so that no
//        train waits.
//        You are given:
//        • An array arr[] of arrival times.
//        • An array dep[] of departure times.
//        Each index represents one train.
//        Rule:
//        If two trains overlap in time, they cannot share a platform.
//        Your mission:
//        Calculate the minimum number of platforms required so that every train can arrive and depart
//        without delay.
//        Constraints:
//        1 ≤ N ≤ 10^4
//        Times are in 24-hour format
//        No extra space allowed beyond constant space.
//        Test Case 1
//        Input:
//        arr = [900, 940, 950, 1100, 1500, 1800]
//        dep = [910, 1200, 1120, 1130, 1900, 2000]
//        Output:
//        3
//        Test Case 2
//        Input:
//        arr = [900, 940]
//        dep = [910, 1200]
//        Output:
//        1
//        Test Case 3
//        Input:
//        arr = [1000, 1010, 1025]
//        dep = [1030, 1020, 1040]
//        Output:
//        3

package CaseStudy;

import java.util.Arrays;

public class MiniPlatform {
    public static void main(String[] args) {
        int arr[]={900, 940, 950, 1100, 1500, 1800};
        int dept[]={910, 1200, 1120, 1130, 1900, 2000};
        Arrays.sort(arr);
        Arrays.sort(dept);
        int i=0;
        int j=0;
        int count=0;
        int maxcount=0;
        while(i<arr.length &&j<dept.length){
            if(arr[i]<dept[j]){
                count++;
                i++;
            }else{
                count--;
                j++;
            }
            maxcount=Math.max(maxcount,count);
        }
        System.out.println(maxcount);
    }
}
