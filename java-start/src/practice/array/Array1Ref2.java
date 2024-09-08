package practice.array;

public class Array1Ref2 {

    public static void main(String[] args) {
        // 변수 선언
        int[] students;
        students = new int[5];

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        students[5] = 40;

        // 변수 값 사용
        for (int i = 0; i < 5; i++) {
            System.out.println("학생 " + (i + 1) + "점쉬: " + students[i]);
        }
    }
}
