import java.util.*;
public class reverseString {
    public static void main(String[] args){
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverse(s);
        System.out.println(Arrays.toString(s));
    }
    static void reverse(char [] s){
        int l=0;
        int r=s.length-1;
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;

        }
    }
}
