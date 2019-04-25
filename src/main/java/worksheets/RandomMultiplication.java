package worksheets;

import javafx.util.Pair;

import java.util.*;

public class RandomMultiplication {
    private static final int MAX = 13;
    private static Random rnd = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        randomProblems();
    }

    private static void randomProblems() {
        LinkedHashSet<Pair<Integer, Integer>> set = new LinkedHashSet<>();
        for (int i = 1; i < 100; i++) {
            int num1 = rnd.nextInt(MAX);
            while (num1 == 0) {
                num1 = rnd.nextInt(MAX);
            }
            int num2 = rnd.nextInt(MAX);
            while (num2 == 0) {
                num2 = rnd.nextInt(MAX);
            }
            if (num2 > num1) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            Pair<Integer, Integer> pair = new Pair<>(num1, num2);
            if (!set.contains(pair)) {
                String formatted = String.format("%2d  " + "\u00D7" + " %2d =  _____", num1, num2);
                System.out.println(formatted);
                set.add(pair);
                System.out.println();
            }
        }
        for (Iterator<Pair<Integer, Integer>> iter = set.iterator(); iter.hasNext(); /* empty*/) {
            List<Pair<Integer, Integer>> list = new ArrayList<>();
            for (int i = 0; iter.hasNext() && i < 5; i++) {
                list.add(iter.next());
            }
            for (Pair<Integer, Integer> p : list) {
                String formatted = String.format("  %2d    ", p.getKey());
                System.out.print(formatted);
            }
            System.out.println();
            for (Pair<Integer, Integer> p : list) {
//                System.out.print("\u00D7 " + p.getValue() + "   ");
                String formatted = String.format("\u00D7 %2d    ", p.getValue());
                System.out.print(formatted);
            }
            System.out.println();
            for (Pair<Integer, Integer> p : list) {
                System.out.print("\u2E3A\u2E3A   ");

            }
            System.out.println();
            System.out.println();
            for (Pair<Integer, Integer> p : list) {
                System.out.print("\u2E3A\u2E3A   ");
            }
            System.out.println();
            System.out.println();
        }
    }
}