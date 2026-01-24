public class CountgreatestElement {
    public static void main(String[] args){
        int[] arr={7,4,8,2,9};
        int res=count(arr);
        System.out.println(res);
    }
    static int count(int [] arr){
        int n=arr.length;
        int count=1;
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                count++;
                max=arr[i];
            }
        }
        return count;
    }
}
