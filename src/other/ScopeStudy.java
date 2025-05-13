package other;

public class ScopeStudy {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);

        for (int i = 0; i < 10; i++) {
//          int i = 10
            // 같은 스코프 안에서는 같은 이름의 변수 선언은 한 번만 하면 된다.
            System.out.println(i);
        }
//        System.out.println(i);
        // i에 접근할 수 없다.

    }

    public static void methodA() {
        //System.out.println(num);
        // num에 접근할 수 없다.
    }
}
