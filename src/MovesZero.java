//optimal Solution
public class MovesZero {
    public static  void main(String[] args){
        int[] arr={1,2,0,5,8,0,0,5,6};
        swap(arr);

    }
    static  void swap(int [] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
