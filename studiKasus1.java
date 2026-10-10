import java.util.Scanner;
/**
 * studiKasus1
 */
public class studiKasus1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup,uangBayar;
        int totalHarga,diskon,TotalBayar;
        int kembalian,kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >=100000) {
            diskon = totalHarga * 10/100;
        }
            totalBayar = totalHarga - diskon;
        System.out.println("Total harga Rp " +totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total bayar")
    }
}