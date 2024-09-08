package practice.method;

public class Overloading3 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));          // 정확히 동일한 파라미터 타입을 갖는 오버라이딩 함수가 없지만 int 형이기 때문에 double 로 자동 형변환 되어 문제 없다.
        System.out.println("1: " + add(1.2, 1.5));
    }

//    public static int add(int a, int b) {
//        System.out.println("1번 호출");
//        return a + b;
//    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
