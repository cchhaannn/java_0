package practice.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("이름을 입력하세요 (종료를 입력하면 종료):");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("나이를 입력하세요: ");
            int age = input.nextInt();
            input.nextLine();   // ⭐

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }

        /*
        * 1. "이름1" + 엔터(\n)
        * 2. 10 + 엔터(\n)
        *
        * 2번 입력 시, input.nextInt()는 10만 읽어감
        * 엔터(\n)은 안읽혀지고 남아서 while 문에 의해 다시 input.nextLine()으로 올라가서 읽혀짐
        * 따라서 결과 콘솔창을 보면 다음과 같이 출력된다.
        *
        * 입력한 이름: 이름1, 나이: 10
        * 이름을 입력하세요 (종료를 입력하면 종료):
        * 나이를 입력하세요:
        *
        * 따라서 21번 라인처럼 줄을 한 번 더 읽음으로 해결할 수 있다.
        * */
    }
}
