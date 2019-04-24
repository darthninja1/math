public class LearnMultiplication {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Multiplication Table for " + i);
            for (int j = 0; j <= 12; j++) {
                String formatted = String.format("%2d  x %2d  =  %3d", i, j, i * j);
                System.out.println(formatted);
            }
            System.out.println();
        }
    }
}