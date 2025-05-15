package ch04.sec03;

public class StringEqualStudy {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.printf("1. %s == %s : %b\n", str1, str2, str1 == str2);
        System.out.printf("%s == %s : %b\n", str1, str2, str1.equals(str2));
        System.out.printf("%s == %s : %b\n", str1, str2, str2.equals(str1));

        String str3 = new String("strrr");
        String str4 = new String("strrr");

        System.out.printf("%s == %s : %b\n", str3, str4, str3 == str4);
        System.out.printf("%s == %s : %b\n", str3, str4, str3.equals(str4));
        System.out.printf("%s == %s : %b\n", str3, str4, str4.equals(str3));
    }
}
