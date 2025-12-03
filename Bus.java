public class Bus {

    // Pembagian tempat
    private Penumpang[] penumpangBiasa = new Penumpang[16];
    private Penumpang[] penumpangPrioritas = new Penumpang[4];
    private Penumpang[] penumpangBerdiri = new Penumpang[20];

    private final int ONGKOS = 2000;
    private int totalPendapatan = 0;
