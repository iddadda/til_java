package ch05.sec06;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] intArr = {11, 12, 19, 33};
        for (int num : intArr) {
            System.out.println(num);
        }
        System.out.println("--------");
        for (int i = 0; i < intArr.length; i++) {
            int num = intArr[i];
            System.out.println(num);
        }
    }
}
