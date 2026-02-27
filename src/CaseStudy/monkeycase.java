//There are total n number of Monkeys sitting on the branches of a huge Tree. As travelers
//offer Bananas and Peanuts, the
//Monkeys jump down the Tree. If every Monkey can eat k Bananas and j Peanuts. If total
//m
//number of Bananas and p number
//of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree
//        after
//some of them jumped down to eat.
//At a time one Monkeys gets down and finishes eating and go to the other side of the
//road.
//The Monkey who climbed down
//does not climb up again after eating until the other Monkeys finish eating.
//Monkey can either eat k Bananas or j Peanuts. If for last Monkey there are less than k
//Bananas left on the ground or less than j Peanuts left on the ground, only that Monkey
//can eat Bananas(<k) along with the
//Peanuts(<j)

package CaseStudy;

import java.util.*;
public class monkeycase {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mb=sc.nextInt();
        int mp=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
//code
        int MonkeyBan=m/mb;
        int Monkeypen=p/mp;

        int total=MonkeyBan+Monkeypen;
        int monkeyRem=m%mb;
        int monkeyrem=p%mp;
        if(monkeyRem>0 || monkeyrem>0){
            total++;
        }
        int ans=n-total;
        System.out.println(ans);
    }
}