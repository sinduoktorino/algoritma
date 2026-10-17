import java.util.Scanner;

public class pola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        int j = 0;
        int i = 0;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
