//Brute force
// taking extra space

public class Rotate_1 {

    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6};
        int d=3;
        int n=arr.length;
        rotate(arr,d,n);

    }
    static void rotate(int [] arr,int d, int n){
        d=d%n;
        int  [] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }

        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];

        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
