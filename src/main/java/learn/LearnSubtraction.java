package learn;

public class LearnSubtraction {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Subtraction Table for " + i);
            System.out.println();
            for (int j = 9; j >= i; j--) {
                String formatted = String.format("%d - %d  = %2d", j, i, j - i);
                System.out.println(formatted);
            }
            System.out.println();
        }
    }
}