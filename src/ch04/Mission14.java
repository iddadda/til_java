package ch04;

public class Mission14 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 4;
        System.out.printf("star: %d\n", star);
        System.out.println("-------------");
        for (int i = 1; i <= star; i++) {
            int underCnt = star - i;
            for (int k1 = 0; k1 < underCnt; k1++) {
                System.out.print("_");
            }
            for (int k2 = 0; k2 < i; k2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");
        for (int i = star; i > 0; i--) {
            for (int k = 1; k <= star; k++) {
                System.out.print(k < i ? "_" : "*");
            }
            System.out.println();
        }
    }
}
