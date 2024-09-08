package practice.cond;

public class ScoreEx {

    public static void main(String[] args) {
        int score = 90;

        if (90 <= score) {
            System.out.println("학점은 A 입니다.");
        } else if (80 <= score && score <= 90) {
            System.out.println("학점은 B 입니다.");
        } else if (70 <= score && score <= 80) {
            System.out.println("학점은 C 입니다.");
        } else if (60 <= score && score <= 70) {
            System.out.println("학점은 D 입니다.");
        } else {
            System.out.println("학점은 F 입니다.");
        }
    }
}
