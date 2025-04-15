import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        Scanner input1321 = new Scanner(System.in);

        Barang dataMain = new Barang();
        // Data awal
        Barang data1 = new Barang("Br001", "Leo Kripik", "Makanan", 10, 1000);
        Barang data2 = new Barang("Br002", "You C1000 Botol", "Minuman",
                10, 7000);
        Barang data3 = new Barang("Br003", "Teh Pucuk Botol", "Minuman",
                10, 4000);
        Barang data4 = new Barang("Br004", "Rinso Cair", "Sabun", 10,
                7000);
        Barang data5 = new Barang("Br005", "Mama Lemon Cair", "Sabun", 10,
                1000);

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
                    dataMain.tampilDataBarang();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        }
    }
}
