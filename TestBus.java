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
