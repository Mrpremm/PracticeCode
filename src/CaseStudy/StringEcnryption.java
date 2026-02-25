//import javax.crypto.Cipher;
//
//The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by a number of places down the alphabet.
//
//X=1
//
//        For example, with a shift of 1, P would be replaced by Q, Q would become R, and so on. To pass an encrypted message from one person to another, it is first necessary that both parties have the 'Key' for the cipher, so that the sender may encrypt and the receiver may decrypt it. Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there are 26 total alphabets.
//
//As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9. Digits can also be shifted by key places.
//
//        {
//
//For Example, if a given plain text contains any digit with values 5 and key =2, then 5 will be replaced by 7, "-"(minus sign) will remain as it is.
//
//Key value less than 0 should result into "INVALID INPUT"

package CaseStudy;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringEcnryption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        System.out.println(Encryption(s,key));
    }
    static String Encryption(String s,int key){
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='0'&& ch<='9'){
                char newV=(char) ((((ch-'0')+key)%10)+'0');
                ans.append(newV);
            } else if (ch>='a'&& ch<='z') {
                char newV=(char)((((ch-'a')+key)%26)+'a');
                ans.append(newV);

            } else if (ch>='A'&& ch<='Z') {
                char newV=(char)((((ch-'A')+key)%26)+'A');
                ans.append(newV);

            }else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
