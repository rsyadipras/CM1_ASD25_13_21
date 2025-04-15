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
        System.out.println("Kode \t\t\tNama Barang \t\t\tKategori \t\tStock \t\t\tHarga");
        for (Barang tmp : listBarang) {
            System.out.print(tmp.kodeBarang + "\t\t\t");
            System.out.print(tmp.nama + "\t\t\t");
            System.out.print(tmp.kategori + "\t\t\t");
            System.out.print(tmp.stok + "\t\t\t");
            System.out.print(tmp.harga + "\t\t\t\n");

        }
    }
}