package ch04.sec05;

public class WhilStudy {
    public static void main(String[] args) {
//        for문으로 0~9까지 출력하시오.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("-------------");

        int i = 0;
        while (i < 10) {
            System.out.println(i++);
        }
    }
}
