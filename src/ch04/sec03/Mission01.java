package ch04.sec03;

public class Mission01 {
    public static void main(String[] args) {
        int month = (int) (Math.random() * 16.0);
        System.out.println("month: " + month);
        // switch이용하여 month 값이
        // 12, 1, 2 => 겨울
        // 3, 4, 5 => 봄
        // 6, 7, 8 => 여름
        // 9, 10, 11 => 가을

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("해당 계절이 없습니다.");
        }
    }
}
