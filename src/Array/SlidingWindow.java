package Array;//Given N cards arranged in a row, each card has an associated score denoted by the cardScore array.
//        Choose exactly k cards. In each step, a card can be chosen either from the beginning or the end of the row. The score is the sum of the scores of the chosen cards.
//        Return the maximum score that can be obtained.
//        Examples:
//        Input: cardScore = [1, 2, 3, 4, 5, 6], k = 3
//        Output: 15
//        Explanation: Choosing the rightmost cards will maximize your total score. So optimal cards chosen are the rightmost three cards 4,5,6.
//        Th score is 4+ 5+ 6 => 15.
//        Input: cardScore = [5, 4, 1, 8, 7, 1, 3], k = 3
//        Output: 12

import  java.util.*;
public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sliding(arr, k));
    }

    static int sliding(int[] arr, int k) {
        int max = 0;
        int lsum = 0, rsum = 0;
        for (int i = 0; i < k; i++) {
            lsum = lsum + arr[i];
        }
        max = lsum;
        int right = arr.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - arr[i];
            rsum = rsum + arr[right];
            right--;
            max = Math.max(max, lsum + rsum);
        }
        return max;

    }
}
