//Within the Grand Archive of Computational Manuscripts, ancient texts are often corrupted by
//        ornamental glyphs, spacing distortions, and erratic casing introduced during digital migration.
//        A manuscript is declared structurally symmetrical if, after applying purification rules, its character
//        sequence reads identically forward and backward.
//        Purification Rules:
//        • Only alphabetic characters (a–z, A–Z) and digits (0–9) are considered.
//        • All symbols and whitespace must be ignored.
//        • Character comparison is case-insensitive.
//        Your mission is to validate whether each submitted manuscript qualifies as symmetrical under these
//        strict archival standards.
//        Input Format
//        • First line: Integer T
//        • Next T lines: String S
//        Output Format
//        Print Yes if symmetrical, otherwise print No

package CaseStudy;
import java.util.*;
public class Palindromesatify {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++){
            String s=sc.nextLine();
            boolean ans=palindrome(s);
            if(ans) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
    static boolean palindrome(String s){
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r){
            char ch=s.charAt(l);
            char chh=s.charAt(r);
            if(!Character.isLetterOrDigit(ch)){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(chh)){
                r--;
                continue;
            }
            if(Character.toLowerCase(ch)!=Character.toLowerCase(chh)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
