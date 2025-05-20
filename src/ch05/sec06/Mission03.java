package ch05.sec06;

import java.util.Arrays;

public class Mission03 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(Arrays.toString(arr));
        System.out.println("------------");

        // [10, 20, 30]의 형태로 나오게 코딩
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            int len = arr.length - 1;
            if (i < len) {
                System.out.print(", ");
            }
        }
        System.out.print("]");


        System.out.println("");
        System.out.println("------------");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[0]);
            } else {
                System.out.printf(", %d", arr[i]);
            }
        }
        System.out.print("]");

        System.out.println("");
        System.out.println("------------");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            int len = arr.length - 1;
            System.out.print(arr[i] + (i < len ? ", " : ""));
        }
        System.out.print("]");

        System.out.println("");
        System.out.println("------------");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            int len = arr.length - 1;
            System.out.print((i != 0 ? ", " : "") + arr[i]);
        }
        System.out.print("]");

        System.out.println("");
        System.out.println("------------");

        System.out.printf("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.print("]");
    }

}