public class ServiceClass {
    TransaksiPembelian[] Trs = new TransaksiPembelian[5];
    int Index;

    void tambahDataTransaksi(TransaksiPembelian trP) {
        if (Index < Trs.length) {
            Trs[Index] = trP;
            Index++;
        } else {
            System.out.println("Maksimal data transaksi adalah 5");
        }
    }

    // Sort
    void selectionSort() {

        for (int i = 0; i < Trs.length - 1; i++) {
            int idxMin = i;

            for (int j = i + 1; j < Trs.length; j++) {
                if (Trs[j].brg.nama.compareTo(Trs[idxMin].brg.nama) < 0) {
                    idxMin = j;
                }
            }

            TransaksiPembelian temp = Trs[idxMin];
            Trs[idxMin] = Trs[i];
            Trs[i] = temp;
        }

    }

    // Searching
    void sequantialSearching(String namaBarang, TransaksiPembelian[] listTransaksi) {
        boolean found = false;

        for (int i = 0; i < listTransaksi.length; i++) {
            if (listTransaksi[i].brg.nama.equalsIgnoreCase(namaBarang)) {
                found = true;

                System.out.println("\nTransaksi dengan barang '" + namaBarang + "' ditemukan:");
                System.out.println("Kode Transaksi    : " + listTransaksi[i].kodeTransaksi);
                System.out.println("Nama Pembeli      : " + listTransaksi[i].namaPembeli);
                System.out.println("Tanggal Pembelian : " + listTransaksi[i].tanggalPembelian);
                System.out.println("Quantity          : " + listTransaksi[i].qty);
                System.out.println("Barang            : " + listTransaksi[i].brg.nama);
                System.out.println("Harga Satuan      : " + listTransaksi[i].brg.harga);
                System.out.println("Total Harga       : " + (listTransaksi[i].qty * listTransaksi[i].brg.harga));
            }
        }

        if (!found) {
            System.out.println("Tidak ditemukan transaksi dengan barang '" + namaBarang + "'");
        }
    }

}
