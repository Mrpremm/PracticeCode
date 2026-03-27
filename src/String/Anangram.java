package String;

import java.util.HashMap;

public class Anangram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        if (s.length() != t.length()) {
            System.out.println("False");
            return;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }
        }
        if(map.isEmpty()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
