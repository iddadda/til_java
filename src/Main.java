//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

/*
    my name is hong

    Pascal Case: MyNameIsHong
    Camel Case: myNameIsHong

    클래스라는 그릇을 만들어야 한다.
    그릇에는 코드가 작성된다. (메소드, 변수 등등)
    클래스 이름은 파일 이름과 같아야 한다.
    메소드는 함수라고 보면 된다.
    메인 메소드는 굉장히 중요한 메소드 이다.
 */

// class 이름은 Pascal Case 사용
public class Main {
    public static void main(String[] args) { // 메소드 (Method), 메인 메소드
        //      System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 20; i++) {  // 반복문, for문, for-loop
            System.out.println("i = " + i);
        }
    }
}