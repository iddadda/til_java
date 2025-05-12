package ch04;

public class Mission0301 {
    public static void main(String[] args) {
        // 1~100사이의 랜덤값을 생성하고 출력은 아래와 같은 형식으로 한다.
        // value = 5라면
        // 출력: 5는(은) 홀수입니다.
        // 랜덥값이 value = 54;라면
        //출력: 54는(은) 짝수입니다.

        int value = (int) (Math.random() * 100.0) + 1;       // 1~100 사이의 랜덤값
        if (value % 2 == 0) {
            System.out.printf("%d는(은) 짝수입니다.", value);
        } else {
            System.out.printf("%d는(은) 홀수입니다.", value);
        }


    }
}
