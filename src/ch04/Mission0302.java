package ch04;

public class Mission0302 {
    public static void main(String[] args) {
        // Mission03 다른 방법

        int value = (int) (Math.random() * 100.0) + 1;       // 1~100 사이의 랜덤값
        String oddEven = "홀";
        if (value % 2 == 0) {
            oddEven = "짝";
        }
        System.out.printf("%d는(은) %s수입니다.\n", value, oddEven);
    }
}
