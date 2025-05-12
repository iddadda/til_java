package ch04;

import java.util.Scanner;

public class Mission0401 {
    public static void main(String[] args) {
        // 0~200 사이의 랜덤값
        // 만약 score값이 100~90점 사이면 A 학점
        // 만약 score값이 80~89점 사이면 B 학점
        // 만약 score값이 70~79점 사이면 C 학점
        // 만약 score값이 70점미만이면 D 학점
        // 만약 score값이 100점을 넘기거나 0점 아래면 "측정 불가" 출력

//        int score = (int) (Math.random() * 201.0);
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scan.nextInt();
        System.out.printf("score: %d\n", score);


        if (score < 0 || score > 100) {
            System.out.println("측정불가");
        } else if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else if (score >= 70) {
            System.out.println("C학점");
        } else {
            System.out.println("D학점");
        }
        System.out.println("-- 끝 --");
    }
}

