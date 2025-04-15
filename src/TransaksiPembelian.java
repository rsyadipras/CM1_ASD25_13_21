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

    }
}
