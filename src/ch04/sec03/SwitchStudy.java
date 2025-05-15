package ch04.sec03;

public class SwitchStudy {
    public static void main(String[] args) {
        int num = 2;

        switch (num) {
            case 1:
                System.out.println("1입니다.");
            case 2:
            case 3:
                System.out.println("2 or 3입니다.");
                break;
            default:
                System.out.println("값이 없네요");
            case 4:
                System.out.println("4입니다.");
                break;
        }
        System.out.println("--끝--");
    }
}
