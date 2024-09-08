package practice.variable;

public class Var8 {
    // 정수
    byte b = 127;                   // 1 byte
    short s = 32767;                // 2 byte
    int i = 2147483647;             // 4 byte
    long l = 9223372036854775807L;  // 8 byte, 대충 20억이 넘을 것 같으면 long 을 쓰자

    // 실수
    float f = 10.0f;                // 4 byte, 정밀도가 낮아 실무에서 거의 사용하지 않는다. double 을 권장한다.
    double d = 10.0;                // 8 byte

    // String 의 경우 동적으로 메모리를 갖는다

    /*
    * 실무에서 자주 사용하는 타입
    * 정수    : int, long (20억 기준)
    * 실수    : double
    * 불린    : boolean
    * 문자열   : String
    * */
}
