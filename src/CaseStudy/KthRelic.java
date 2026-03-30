//import java.sql.Time;
//
//In the lost kingdom of Zohoria, archaeologists discovered a sacred vault containing powerful relics.
//Each relic has a power value recorded in an array arr[].
//The royal historian declares:
//        • There are N relics.
//        • Each relic has a strength between 1 and 10^6.
//        • The relics are not arranged in any particular order.
//• You must determine the Kth weakest relic.
//        However, the High Council has forbidden the use of magical sorting spells (inbuilt sort functions).
//Your task:
//Identify the Kth smallest relic power without using any built-in sorting enchantments.
//        Input:
//        • Array arr[]
//• Integer K
//Output:
//Power value of the Kth smallest relic.
//        Constraints:
//        1 ≤ N ≤ 10^6
//        1 ≤ arr[i] ≤ 10^6
//        1 ≤ K ≤ N
//Expected:
//Time: O(n + max_element)
//Space: O(max_element)
//Test Case 1
//Input:
//arr = [7, 10, 4, 3, 20, 15]
//k = 3
//Output:
//        7
//Test Case 2
//Input:
//arr = [2, 3, 1, 20, 15]
//k = 4
//Output:
//        15
//Test Case 3
//Input:
//arr = [5, 5, 5, 5]
//k = 2
//Output:
//        5

package CaseStudy;

public class KthRelic {
    public static void main(String[] args) {
        int [] arr={7, 10, 4, 3, 20, 15};
        int k=3;
        int n=arr.length;
        int max=1000000;
        int [] freq=new int [max+1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        int count=0;
        for(int i=1;i<=max;i++){
            count=count+freq[i];
            if(count>=k){
                System.out.println(i);
                return;
            }
        }
    }
}
