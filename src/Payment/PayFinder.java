package Payment;

import java.util.ArrayList;
import java.util.List;

public class PayFinder {
    /**
     * @param n the payment you have to find different splits for
     * @return returns a list of ways to pay
     */
    public static List<String> findPayment(int n) {
        ArrayList<Integer> combos = new ArrayList<Integer>();
        List<String> output = new ArrayList<String>();
        combos.add(0);
        combos.add(0);
        combos.add(0);
        combos.add(0);
        possiblePayment(n, 0, combos, output);
        return output;
    }
    /**
     * @param n number needed to pay
     * @param i an iterator
     * @param combos a list of possible combos
     * @param output the array to print when you call findPayment
     */
    private static void possiblePayment(int n, int i, ArrayList<Integer> combos, List<String> output) {
        int sum = getSum(combos);
        if (sum == n) {
            output.add(0, combos.toString());
            output.add(0, "\n");
        } else {
            while (i < combos.size()) {
                combos.set(i, combos.get(i) + 1);
                if (getSum(combos) <= n) {
                    possiblePayment(n, i, combos, output);
                }
                combos.set(i, combos.get(i) - 1);
                ++i;
            }
        }
    }
    /**
     * @param combos individual combinations
     * @return returns the sum of all the numbers added together multiplied by their values in the combo list
     */
    private static int getSum(ArrayList<Integer> combos) {
        int sum = combos.get(0);
        sum += 5 * combos.get(1);
        sum += 20 * combos.get(2);
        sum += 100 * combos.get(3);
        return sum;
    }
}
