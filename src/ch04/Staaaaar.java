package ch04;

import java.util.Scanner;

public class Staaaaar {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("별 계단수: ");
//        int star = scan.nextInt();
        int star = 3;
        int i = 0;
        int j = 0;

        System.out.println("==왼쪽정렬==");
        for (i = 1; i <= star; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==오른쪽정렬==");
//        for (i = 0; i <= star; i++) {
//            for (j = 0; j < i; j++) {
//                if (j == i) {
//                    System.out.print("*");
//                }
//            }
            System.out.print("");

        }
        System.out.println();


        System.out.println("==왼쪽거꾸리==");

        for (i = 0; i < star; i++) {
            for (j = star; i < j; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======");


    }
}