import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Boolean ans=Palindrome(s);
        if(ans){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    static Boolean Palindrome(String s){
        char [] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
