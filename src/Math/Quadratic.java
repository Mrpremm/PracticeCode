//In this problem, we are given a non-negative integer c, and we have to find out whether
//there exist two integers a and b such that: a² + b² = c. This is a very popular number-based
//challenge that helps you build mathematical thinking and logical reasoning.
//Example 1
//Input:
//c = 5
//Output:
//        true
//Explanation:
//We can take: a = 1, b = 2, 1² + 2² = 1 + 4 = 5
//Since we can find such integers, so the answer is true


package Math;

public class Quadratic {
    public static void main(String[] args) {
        int n = 3;
        long a = 0;
        long b = (long) Math.sqrt(n);
        while (a <= b) {
            long squre = a * a + b * b;
            if (squre == n) {
                System.out.println("True");
                return;
            } else if (squre < n) {
                a++;
            } else {
                b--;
            }

        }
        System.out.println("False");
    }
}