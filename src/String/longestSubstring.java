//One day, a curious boy named Sam found a magical scroll. On it was
//a long string of letters.
//His grandmother said:
//        "This string hides a powerful secret! You must find the longest
//sequence of letters in it where no letter repeats. That part holds the
//magic."
//Excited, Sam needs your help to solve this puzzle!
//Your task is to help Sam find the length of the longest substring
//without repeating any characters.

package String;
//Brute Force

import java.util.Scanner;

public class longestSubstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ans=longest(s);
        System.out.println(ans);
        longestsubstr(s);

    }
    static void  longestsubstr(String s){
        String str="";

        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            int [] hash=new int[256];
            for(int j=i;j<n;j++){
                if(hash[s.charAt(j)]==1) break;
                hash[s.charAt(j)]=1;
                int len=j-i+1;
                if(len>max){
                    max=len;
                   // str=s.substring(i,j+1);


                }
            }
        }
        System.out.println("Substring: " +str);
    }
    static int longest(String s){
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            int[] hashArray=new int[256];
            for(int j=i;j<n;j++){
                if(hashArray[s.charAt(j)]==1) break;
                hashArray[s.charAt(j)]=1;
                int len=j-i+1;
                 max=Math.max(max,len);
            }

        }
        return max;

    }

}
