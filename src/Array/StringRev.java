package Array;

import java.util.*;
public class StringRev {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        System.out.println(rev(string));
    }
    static String rev(String string){
        char[] arr=string.toCharArray();
        int i=0;
        int j=arr.length-1;
        while (i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String rev=new String(arr);
        return rev;
    }
}
