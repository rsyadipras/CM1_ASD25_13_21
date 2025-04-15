import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        Scanner input1321 = new Scanner(System.in);
        Barang[] listBarang = new Barang[5];

        // Data awal barang
        listBarang[0] = new Barang("Br001", "Leo Kripik", "Makanan", 10, 1000);
        listBarang[1] = new Barang("Br002", "You C1000 Botol", "Minuman", 10, 7000);
        listBarang[2] = new Barang("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
        listBarang[3] = new Barang("Br004", "Rinso Cair", "Sabun", 10, 7000);
        listBarang[4] = new Barang("Br005", "Mama Lemon Cair", "Sabun", 10, 1000);

        Barang dataBarang = new Barang();
        dataBarang.setListBarang(listBarang);

        ServiceClass systemService = new ServiceClass();

        // Data awal transaksi
        systemService.tambahDataTransaksi(new TransaksiPembelian("Tr001", "Santi", "21-04-2004", 1, listBarang[0]));
        systemService.tambahDataTransaksi(new TransaksiPembelian("Tr002", "Vani", "21-04-2004", 2, listBarang[1]));
        systemService.tambahDataTransaksi(new TransaksiPembelian("Tr003", "Siska", "23-04-2004", 3, listBarang[2]));
        systemService.tambahDataTransaksi(new TransaksiPembelian("Tr004", "MeiMei", "23-04-2004", 1, listBarang[3]));
        systemService.tambahDataTransaksi(new TransaksiPembelian("Tr005", "Ihsan", "24-04-2004", 1, listBarang[4]));

        TransaksiPembelian dataTransaksiPembelian = new TransaksiPembelian();
        dataTransaksiPembelian.setListTransaksiPembelian(systemService.Trs);

        while (true) {
            System.out.println("\n======= Toko Manasuka =======");
            System.out.println("Bank Menu: ");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = input1321.nextInt();
            input1321.nextLine();

            switch (pilihan) {
                case 1:
                    dataBarang.tampilDataBarang();
                    break;
                case 2:
                    dataTransaksiPembelian.tampilDataTransaksi();
                    break;
                case 3:
                    System.out.print("Masukkan nama barang yang ingin dicari pada transaksi : ");
                    String namaBarang = input1321.nextLine();
                    systemService.sequantialSearching(namaBarang, systemService.Trs, listBarang);
                    break;
                case 4:
                    System.out.println("Pengurutan nama barang pada transaksi berdasarkan abjad : ");
                    systemService.selectionSort();
                    dataTransaksiPembelian.tampilDataTransaksi();
                    break;
                case 5:
                    System.out.println("Terima Kasih.");
                    input1321.close();
                    return;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        }
    }
}
