//Count Maximum Consecutive One's in the array

public class ConsecutiveOnes {
    public static void main(String[] args){
        int [] arr={1, 0, 1, 1, 0, 1};
        int res=maxCount(arr);
        System.out.println(res);
    }
    static int maxCount(int [] arr){
        int count=0,max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count=count+1;
                if(max<count) max=max+1;
            }
            else{
                count=0;
            }
        }
        return max;
    }
}
