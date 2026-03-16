//In a secure digital vault, extremely large integers are stored as strings to prevent overflow
//        vulnerabilities. Intelligence analysts require extraction of the most valuable odd numerical fragment
//        embedded within the vault entry.
//        Given a numeric string num, determine the largest-valued substring that:
//        • Is contiguous.
//        • Represents an odd integer.
//        • Is non-empty.
//        If no odd substring exists, return an empty string "".
//        Note:
//        The substring must be evaluated numerically for maximum value comparison, not lexicographically.
//        Constraints
//        1 ≤ |num| ≤ 10^5
//        num contains only digits and has no leading zeros.
//        Test Cases
//        Input:
//        52
//        Output:
//        5
//        Input:
//        4206
//        Output:
//        ""
//        Input:
//        35427
//        Output:
//        35427

package CaseStudy;

import java.util.Scanner;

public class oddSusbtring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        String num="";
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if((ch-'0')%2==1){
                num= s.substring(0,i+1);
                break;
            }
        }
        System.out.println(num);
    }
}
