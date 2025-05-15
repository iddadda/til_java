package ch04;

public class Mission13 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 3;
        System.out.printf("star: %d\n", star);
        for (int i = 1; i <= star; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");

    }
}

