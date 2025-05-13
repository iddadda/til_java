package ch04;

public class Mission11 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.printf("--%d단--\n", i);
            for (int k = 1; k < 10; k++) {
                System.out.printf("%d x %d = %d\n", i, k, i * k);
            }
            System.out.println();
        }
    }
}
