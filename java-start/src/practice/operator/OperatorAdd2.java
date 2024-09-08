package practice.operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a;    // a에 1을 더하고 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;

        b = a++;    // a를 b에 대입하고 1을 더함
        System.out.println("a = " + a + ", b = " + b);

    }
}
