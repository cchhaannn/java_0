package practice.array;

public class Array1Ref3 {

    public static void main(String[] args) {
        // 변수 선언
        int[] students;
        students = new int[]{90, 80, 70, 60, 50};

        // 변수 값 사용
        for (int i = 0; i < 5; i++) {
            System.out.println("학생 " + (i + 1) + "점쉬: " + students[i]);
        }
    }
}
