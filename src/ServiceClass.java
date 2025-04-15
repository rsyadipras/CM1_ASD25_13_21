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
        for (int i = 0; i < Index - 1; i++) {
            int idxMin = i;

            for (int j = i + 1; j < Index; j++) {
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
    void sequantialSearching(String namaBarang) {
        int pos = -1;
        for (int i = 0; i < Index; i++) {
            if (Trs[i].brg.nama.equalsIgnoreCase(namaBarang)) {
                pos = i;

                System.out.println("Barang ditemukan pada indeks: " + pos);
                Trs[i].tampilDataTransaksi();
                return;
            }
        }
        if (pos == -1) {
            System.out.println("Barang dengan nama " + namaBarang + " tidak ditemukan");
        }
    }

}
