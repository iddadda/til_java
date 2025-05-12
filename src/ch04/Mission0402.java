package ch04;

import java.util.Scanner;

public class Mission0402 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scan.nextInt();
        System.out.printf("score: %d\n", score);

        if (score < 0 || score > 100) {
            System.out.println("측정불가");
        } else {
            String result = "D";
            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            }
            System.out.printf("%s학점\n", result);
        }
        System.out.println("-- 끝 --");
    }
}

