//A party has been organized on cruise. The party is organized for a limited time(T).
//The number of guests
//entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of
//the array. The task is to
//find the maximum number of guests present on the cruise at any given instance within
//T hours

//Input :
//        5 -> Value of T
//[7,0,5,1,3] -> E[], Element of E[0] to E[N-1], where input each element is
//separated by new line
//[1,2,1,3,4] -> L[], Element of L[0] to L[N-1], while input each element is
//separate by new line.
//        Output :
//        8 -> Maximum number of guests on cruise at an instance

package CaseStudy;

import java.util.*;
public class PartyAtCruse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int E[]=new int[t];
        int L[] =new int[t];
        for(int i=0;i<t;i++){
            E[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++){
            L[i]=sc.nextInt();
        }
        System.out.println(maxsum(E,L,t));

    }
    static int maxsum(int[]E,int[]L,int t){
        int max=0;
        int sum=0;
        for(int i=0;i<t;i++){
            sum=sum+E[i]-L[i];
            max=Math.max(max,sum);
        }
        return max;
    }

}