import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] count = new int[10]; 
        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    count[i]++;
                }
            }
        }
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " : " + count[i]);
        }
    }
}
