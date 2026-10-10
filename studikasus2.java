import java.util.Scanner;
/**
 *studikasus2
 */
public class studikasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        String status;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPKM;


        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Masukkan jumlah dokumen: ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
            || jenisKegiatan.equalsIgnoreCase("BAKORMA") 
            || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

                System.out.print("Peringkat juara : ");
                peringkatJuara = sc.nextInt();

                if (jumlahDokumen <4) {
                   status =  ("Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + "dokumen). dana penghargaan tidak diberikan");

                } else {
                    if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                        status = ("Dana penghargaan diberikan");
                    } else {
                        status = ("Bukan juara 1,2,3 " + "dana penghargaan tidak diberikan");
                    }
                } 
                     if  (jenisKegiatan.equalsIgnoreCase("PKM")) {
                        System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
                        statusPKM = sc.nextInt();

                        if (jumlahDokumen <4) {
                            status = "Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen) dana tidak diberikan";
                        } else {
                            status = "kegiatan lainnya. dana penghargaan tidak diberikan";
                        }
                    }
                    System.out.print("Status : " + status);
                }
            }
    }
