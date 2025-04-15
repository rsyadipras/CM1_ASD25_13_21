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
        System.out.println(
                "Kode Transaksi \t\t\tNama Pembeli \t\t\tTanggal Pembelian \t\t\tNama Barang \t\t\tKuantitas \t\t\tHarga");
        for (TransaksiPembelian trsPembelian : listTransaksiPembelians) {
            System.out.print(trsPembelian.kodeTransaksi + "\t\t\t\t");
            System.out.print(trsPembelian.namaPembeli + "\t\t\t\t");
            System.out.print(trsPembelian.tanggalPembelian + "\t\t\t\t");
            System.out.print(trsPembelian.brg.nama + "\t\t\t");
            System.out.print(trsPembelian.qty + "\t\t\t\t");
            System.out.print(trsPembelian.brg.harga + "\n");
        }
    }
}
