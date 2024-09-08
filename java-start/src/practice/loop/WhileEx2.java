package practice.loop;

public class WhileEx2 {

    public static void main(String[] args) {
        int num = 2;
        int count = 1;
        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
        for (int i = 2, j = 1; j <= 10; i+=2, j++) {
            System.out.println(i);
        }
    }
}
