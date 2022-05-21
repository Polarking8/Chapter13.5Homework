package Payment;

import java.util.Scanner;

public class PayTester {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount needed to pay: ");
        int paymentNeeded = in.nextInt();
        System.out.println("O stands for Ones, F for Fives, T for Twenties, H for Hundreds");
        System.out.println("Possible ways to pay: \n   O  F  T   H  \n" + PayFinder.findPayment(paymentNeeded));
    }
}
