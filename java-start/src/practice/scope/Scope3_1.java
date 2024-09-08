package practice.scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // 불필요한 스코프를 갖는 경우, 메모리를 낭비하고 코드 복잡성만 증가 시킨다.
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
