package ch04;

public class Mission08 {
    public static void main(String[] args) {
        int sum = 0;

        sum = sum + 1;
        sum = sum + 2;

        System.out.println("sum: " + sum);

//        1~100 모두 더한값 출력
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.printf("1~100까지 sum: %d", sum);
    }
}
