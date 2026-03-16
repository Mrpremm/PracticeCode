//During a forensic audit of encrypted commercial records, investigators discovered that legitimate
//        financial values are hidden within strings containing alphabetic interference. Every contiguous cluster
//        of digits represents a valid monetary entry.
//        Your task is to traverse the ledger string and extract all numeric clusters, interpret them as integers,
//        and compute their cumulative total.
//        Each group of consecutive digits must be treated as a single number, regardless of its length.
//        Constraints
//        1 ≤ |S| ≤ 10^5
//        Sum of numbers ≤ 10^5
//        Test Cases
//        Input:
//        1abc23
//        Output:
//        24
//        Input:
//        geeks4geeks
//        Output:
//        4

package CaseStudy;
import java.util.Scanner;
public class ExtractingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Extract(s));
    }
    static int Extract(String s){
        int n=s.length();
        int sum=0;
        int num=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int a=ch-'0';
                num=num*10+a;
            }else{
                sum=sum+num;
                num=0;
            }
        }
        sum=sum+num;
        return sum;
    }
}