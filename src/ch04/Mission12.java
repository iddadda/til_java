package ch04;

public class Mission12 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int k = 2; k < 10; k++) {
                System.out.printf("%d x %d = %d\t", k, i, k * i);
            }
            System.out.println();
        }
    }
}
