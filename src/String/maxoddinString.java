//Given a numeric string s, find the maximum odd number that can be formed using any substring of s.
//
//        A substring is a contiguous sequence of characters within the string.
//
//        The resulting number must be odd.
//
//        The resulting number must not contain leading zeroes (unless the number itself is "0").
//
//        If no odd number can be formed, return an empty string ""

package String;

import java.util.Scanner;

public class maxoddinString {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(odd(s));
    }
    static String odd(String s){
        int i=0;
        int inx=-1;
        for (i=s.length()-1;i>=0;i--){
            if((s.charAt(i)-'0')%2==1){
                inx=i;
                break;
            }
        }
        if(inx==-1) return "";
        int j=0;

        while(s.charAt(j)==0){
            j++;
        }
        return  s.substring(j,inx+1);
    }
}
