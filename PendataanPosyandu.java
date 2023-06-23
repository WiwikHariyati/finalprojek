import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PendataanPosyandu {

    public static void main(String[] args) {
        Queue<String> antrianPosyandu = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("====== Pendataan Posyandu Sakura ======");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Daftar Antrian");
            System.out.println("3. Proses Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahAntrian(antrianPosyandu, scanner);
                    break;
                case 2:
                    tampilkanAntrian(antrianPosyandu);
                    break;
                case 3:
                    prosesAntrian(antrianPosyandu);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

    private static void tampilkanAntrian(Queue<String> antrianPosyandu) {
        System.out.println("Antrian saat ini: " + antrianPosyandu);
    }

    private static void tambahAntrian(Queue<String> antrianPosyandu, Scanner scanner) {
        System.out.print("Masukkan nama anak: ");
        String namaAnak = scanner.next();
        antrianPosyandu.add(namaAnak);
        System.out.println("Anak dengan nama " + namaAnak + " telah ditambahkan ke antrian.");
    }

    private static void prosesAntrian(Queue<String> antrianPosyandu) {
        if (antrianPosyandu.isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            String namaAnak = antrianPosyandu.poll();
            System.out.println("Anak dengan nama " + namaAnak + " sedang diproses.");
        }
    }
}
