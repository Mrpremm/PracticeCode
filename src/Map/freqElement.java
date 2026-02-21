package Map;

import java.util.*;

import java.util.Scanner;

public class freqElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        freq(arr);
    }
    static void freq(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int key=arr[i];
            int value= map.getOrDefault(key,0)+1;
            map.put(key,value);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+ entry.getValue());
        }

    }
}
