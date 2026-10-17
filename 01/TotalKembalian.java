import java.util.Scanner;

public class TotalKembalian {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int satuan = 0;
        int kembalian = 0;
        int jumlah = 0;

        System.out.print("Satuan: ");
        satuan = input.nextInt();

        System.out.print("jumlah barang: ");
        jumlah = input.nextInt();

        System.out.print("Total uang: ");
        total = input.nextInt();

        int totalHarga = jumlah * satuan;
        System.out.println("Total: " + totalHarga);

        kembalian = total - totalHarga;
        System.out.println("Kembalian: " + kembalian);
    }
}
