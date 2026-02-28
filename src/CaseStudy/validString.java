package CaseStudy;

import java.util.*;
public class validString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(valid(str));
    }
    static int valid(String str){
        int n=str.length();
        int ca=0;
        int cb=0;
        for(int i=0;i<n;i++){
            char s=str.charAt(i);
            if(s=='#'){
                ca++;
            }
            else{
                cb++;
            }

        }
        int total=cb-ca;
        if(total==0) return 0;


        return total;
    }



}