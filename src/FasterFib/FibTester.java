package FasterFib;

import java.util.Scanner;

public class FibTester {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find the Fibonacci number for it: ");
        int n = in.nextInt();
        System.out.println(FibFinder.nthNumberFinder(n));
    }
}
