package String;
import java.util.*;
//Atleast one occurence of a,b,c must be present in question
// i/p-- abcabc
// /o/p-- 10
public class abcSubString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(CountingSubtring(s));
    }
    static int CountingSubtring(String s){
        int count=0;
        int []hash={-1,-1,-1};
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hash[ch-'a']=i;
            if(hash[0]!=-1 && hash[1]!=-1 && hash[2]!=-1){
                count=count+1+Math.min(hash[0],Math.min(hash[1],hash[2]));

            }
        }
        return count;

    }
}
