package ch04;

public class Mission09 {
    public static void main(String[] args) {
        int dan = (int) (Math.random() * 8.0) + 2;
        System.out.println("dan: " + dan);
        int i = 0;
        for (i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }
    }
}
