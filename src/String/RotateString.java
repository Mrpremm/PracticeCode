package String;

public class RotateString {
    public static void main(String[] args) {
        String s="abcde";
        String g="cdeab";

        String doubled=s+s;
        if(doubled.contains(g)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
