package ch05.sec06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Mission02 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;

//        [20, 10]으로 출력되게 하기
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
