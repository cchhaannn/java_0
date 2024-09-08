package practice.array;

public class ArrayDi4 {

    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.println(arr[row][column] + " ");
                System.out.println(arr[row][column] + " ");
                System.out.println(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
