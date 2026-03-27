package CaseStudy;

public class KthRelic {
    public static void main(String[] args) {
        int [] arr={7, 10, 4, 3, 20, 15};
        int k=3;
        int n=arr.length;
        int max=1000000;
        int [] freq=new int [max+1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        int count=0;
        for(int i=1;i<=max;i++){
            count=count+freq[i];
            if(count>=k){
                System.out.println(i);
                return;
            }
        }
    }
}
