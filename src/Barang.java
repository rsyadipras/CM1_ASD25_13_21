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

    void tampilDataBarang() {
        for (Barang tmp : listBarang) {
            System.out.println("Kode Barang : " + this.kodeBarang);
            System.out.println("Nama Barang : " + this.nama);
            System.out.println("Kategori : " + this.kategori);
            System.out.println("Stock : " + this.stok);
            System.out.println("Harga : " + this.harga);
        }
    }
}