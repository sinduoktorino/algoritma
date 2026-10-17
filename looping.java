import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        int jumlah = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                jumlah += i;
            }
        }
        System.out.println("Jumlah bilangan ganjil: " + jumlah);
    }
}