package Math;

public class Armstring {
    public static void main(String[] args) {
        int num=153;
        int orginal=num;
        int temp=num;
        int count=0;
        int sum=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=num;
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit,count);
            temp=temp/10;
        }
        if(sum==orginal){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
