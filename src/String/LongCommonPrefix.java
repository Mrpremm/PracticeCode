package String;
import  java.util.*;

public class LongCommonPrefix {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     sc.nextLine();
     String arr[]=new String[size];
     for(int i=0;i<size;i++){
         arr[i]=sc.nextLine();
     }
     String res=prefix(arr);
        System.out.println("Longest Common prefix:"+res);
    }
    static  String prefix(String[] arr){
        StringBuilder ans=new StringBuilder();
        int n=arr.length;
        Arrays.sort(arr);
        String first=arr[0];
        String last=arr[n-1];
        int trav=Math.min(first.length(),last.length());
        for(int i=0;i<trav;i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return  ans.toString();
    }
}
