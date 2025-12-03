public class Bus {

    // Pembagian tempat
    private Penumpang[] penumpangBiasa = new Penumpang[16];
    private Penumpang[] penumpangPrioritas = new Penumpang[4];
    private Penumpang[] penumpangBerdiri = new Penumpang[20];

    private final int ONGKOS = 2000;
    private int totalPendapatan = 0;

    // Hitung isi array untuk mendapatkan jumlah penumpang
    private int hitungIsi(Penumpang[] arr) {
        int count = 0;
        for (Penumpang p : arr) {
            if (p != null) count++;
        }
        return count;
    }

  // Menempatkan penumpang pada array pertama yang kosong
    private boolean tambahKeArray(Penumpang[] arr, Penumpang p) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = p;
                return true;
            }
        }
        return false;
    }

   // Proses menaikkan penumpang ke dalam bus
    public boolean naikkanPenumpang(Penumpang p) {

        if (p.getSaldo() < ONGKOS) {
            System.out.println("Saldo tidak cukup.");
            return false;
        }

        // Urutan tempat untuk prioritas
        if (p.isPrioritas()) {
            if (tambahKeArray(penumpangPrioritas, p) ||
                tambahKeArray(penumpangBiasa, p) ||
                tambahKeArray(penumpangBerdiri, p)) {

                p.kurangiSaldo(ONGKOS);
                totalPendapatan += ONGKOS;
                return true;
            }
        }
