//A financial AI is analyzing N days of stock prices. For each day i, it must calculate the "dominance
//span".
//Definition:
//The span of day i is the maximum number of consecutive days before day i (including i) such that the
//price on those days is less than or equal to price[i].
//Given:
//N
//        price[]
//Output:
//Span for each day.
//Example:
//Input: [100, 80, 60, 70, 60, 75, 85]
//Output: 1 1 1 2 1 4 6
//Constraint:
//        1 ≤ N ≤ 10^5
//The AI must efficiently compute spans without brute force simulation.
//Test Case 1
//Input:
//        [100, 80, 60, 70, 60, 75, 85]
//Output:
//        1 1 1 2 1 4 6

package CaseStudy;

public class StockpriceBrute {
    public static void main(String[] args) {
        int [] arr={100, 80, 60, 70, 60, 75, 85};
        int n=arr.length;
        int [] span=new int [n];
        for(int i=0;i<n;i++){
            int j=i-1;
            span[i]++;
            while(j>=0&& arr[j]<=arr[i]){
                span[i]++;
                j--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(span[i]+" ");
        }
    }
}
