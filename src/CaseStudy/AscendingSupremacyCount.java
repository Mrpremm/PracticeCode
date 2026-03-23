//A real-time monitoring system records a sequence of integer values Arr of size N. An element is
//considered “dominant” if it is strictly greater than every element that appeared before it.
//The first element is always considered dominant.
//Determine how many elements in the sequence satisfy this dominance condition.
//Constraints:
//        • 1 ≤ N ≤ 20
//        • 1 ≤ Arr[i] ≤ 10000
//Test Cases
//Input
//        N = 5
//Arr = [7, 4, 8, 2, 9]
//Output
//3
//Input
//        N = 5
//Arr = [3, 4, 5, 8, 9]
//Output
//5


        package CaseStudy;

public class AscendingSupremacyCount {
    public static void main(String[] args) {
        int [] arr={7,4,8,2,9};
        int n=arr.length;
        int max=arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
