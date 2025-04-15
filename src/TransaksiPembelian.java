public class TransaksiPembelian {
    String kodeTransaksi, namaPembeli, tanggalPembelian;
    int qty;
    Barang brg;

    TransaksiPembelian[] listTransaksiPembelians = new TransaksiPembelian[5];

    TransaksiPembelian() {

    }

    TransaksiPembelian(String kodeTransaksi, String namaPembeli, String tanggalPembelian, int qty, Barang brg) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembeli = namaPembeli;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        this.brg = brg;
    }

    void setListTransaksiPembelian(TransaksiPembelian[] trsPembelian) {
        listTransaksiPembelians = trsPembelian;
    }

    // Menu 2
    void tampilDataTransaksi() {
        System.out.println("=== Data Transaksi Pembelian ===");
        for (TransaksiPembelian tmp : listTransaksiPembelians) {
            if (tmp != null) {
                System.out.println("Kode Transaksi    : " + tmp.kodeTransaksi);
                System.out.println("Nama Pembeli      : " + tmp.namaPembeli);
                System.out.println("Tanggal Pembelian : " + tmp.tanggalPembelian);
                System.out.println("Quantity          : " + tmp.qty);
                System.out.println("Barang            : " + tmp.brg.nama);
                System.out.println("Harga Satuan      : " + tmp.brg.harga);
                System.out.println("Total Harga       : " + (tmp.qty * tmp.brg.harga));
                System.out.println("--------------------------------");
            }
        }
    }
}
