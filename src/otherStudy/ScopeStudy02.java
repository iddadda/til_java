package otherStudy;

public class ScopeStudy02 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            sum += i;
            System.out.println(sum);
        }
    }
}
