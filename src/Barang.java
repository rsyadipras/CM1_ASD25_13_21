public class Barang {
    String kodeBarang, nama, kategori;
    int stok, harga;

    Barang[] listBarang = new Barang[5];

    public Barang() {

    }

    public Barang(String kodeBarang, String nama, String kategori, int stock, int harga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        stok = stock;
        this.harga = harga;
    }

    void setListBarang(Barang[] lsBarang) {
        listBarang = lsBarang;
    }

    // Menu 1
    void tampilDataBarang() {
        for (Barang tmp : listBarang) {
            System.out.println("Kode Barang : " + tmp.kodeBarang);
            System.out.println("Nama Barang : " + tmp.nama);
            System.out.println("Kategori : " + tmp.kategori);
            System.out.println("Stock : " + tmp.stok);
            System.out.println("Harga : " + tmp.harga);
        }
    }
}