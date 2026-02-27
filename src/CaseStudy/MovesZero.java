//n a small village, a scroll contains a list of numbers. Some of these numbers are
//zeros, which are seen as obstacles. Your task is to move all the zeros to the end of
//the list without changing the order of the other numbers.
//You must do this in-place, without using extra space
//Input Format :
//        •The first line contains an integer n — the
//number of elements in the array.
//        •The second line contains n space-separated
//integers.
package CaseStudy;

import java.util.Scanner;

public class MovesZero {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MovingZeroes(arr);

    }
    static void MovingZeroes(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<arr.length;i++) {
            if (arr[i] != 0) {
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
                j++;
            }
        }
        System.out.print("[");
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println("] ");
    }

}
