import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        int n;
        if (a % 2 == 0) {
            n = a - 1;  
        } else {
            n = a;       
        }
        for (int i = 1; i <= n; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd);
            if (i < n) System.out.print(", ");
        }
    }
}
