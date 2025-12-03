import java.util.Scanner;

public class TestBus {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Bus bus = new Bus();
        int nextId = 1;

        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== MENU BUS ===");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");

            int pilih = in.nextInt();
            in.nextLine(); // membersihkan newline

                   switch (pilih) {

                // Menambah penumpang baru
                case 1:
                    System.out.print("Nama : ");
                    String nama = in.nextLine();

                    System.out.print("Umur : ");
                    int umur = in.nextInt();
                    in.nextLine();

                    System.out.print("Hamil (y/n): ");
                    boolean hamil = in.nextLine().equalsIgnoreCase("y");

                    Penumpang p = new Penumpang(nextId++, nama, umur, hamil);

                    if (bus.naikkanPenumpang(p)) {
                        System.out.println("Penumpang berhasil naik.");
                    } else {
                        System.out.println("Gagal menaikkan penumpang.");
                    }
                    break;

                           // Mengeluarkan penumpang
                case 2:
                    System.out.print("Nama penumpang yang turun: ");
                    String turun = in.nextLine();

                    if (bus.turunkanPenumpang(turun)) {
                        System.out.println("Penumpang turun.");
                    } else {
                        System.out.println("Tidak ditemukan.");
                    }
                    break;
