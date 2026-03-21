package String;
import java.util.*;

public class SortString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ans = sort(s);
        System.out.println(ans);
    }

    static String sort(String s){

        HashMap<Character,Integer> map = new HashMap<>();

        // Step 1: count frequency
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }

        // Step 2: keys to list
        ArrayList<Character> list = new ArrayList<>(map.keySet());

        // Step 3: sort
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));

        // Step 4: build result
        String res = "";

        for(int k=0;k<list.size();k++){
            char chh = list.get(k);
            int count = map.get(chh);

            for(int j=0;j<count;j++){
                res = res + chh;
            }
        }

        return res;
    }
}