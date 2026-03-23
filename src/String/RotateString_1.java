package String;

public class RotateString_1 {
    public static void main(String[] args) {
        String s="abcde";
        String g="cdeab";
        boolean ans=rotate(s,g);
        System.out.println(ans);
    }
    static boolean rotate(String s,String g){
        int n=s.length();
        for(int i=0;i<n;i++){
            s=s.substring(1)+s.charAt(0);
            if(s.equals(g)){
                return true;
            }
        }
        return false;
    }
}
