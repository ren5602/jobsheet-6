import java.util.Scanner;
public class testP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaBuku, potHarga, hargaBayar ;
        double disc;
        String namaBuku, beli, berlangganan;

        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("        Fitur Beli Buku       ");
        System.out.println("------------------------------");
        System.out.println("Sistem Perpustakaan Diponegoro");
        System.out.println("                              ");
        System.out.println("______________________________");
        System.out.println("Judul Buku");
        System.out.println("1. Buku A");
        System.out.println("2. Buku B");
        System.out.println("3. Buku C");
        System.out.println("4. Buku D");
        System.out.println("5. Buku F");
        System.out.print("Masukkan Nama Judul Buku: ");
        String judulBuku= input.nextLine();
        switch (judulBuku) {
        case "Buku A":
        System.out.println("Buku A");
        System.out.println("Penulis: Si A");
        System.out.println("Tersedia");
        System.out.println("Harga Buku: 50k");

            break;
        case "Buku B":
        System.out.println("Buku B Tersedia");
        System.out.println("Penulis: Si B");
        System.out.println("Tersedia");
        System.out.println("Harga Buku: 60k");

            break;
        case "Buku C":
        System.out.println("Buku C Tersedia");
        System.out.println("Penulis: Si C");
        System.out.println("Tersedia");
        System.out.println("Harga Buku: 70k");

            break;
        case "Buku D":
        System.out.println("Buku D Tersedia");
        System.out.println("Penulis: Si D");
        System.out.println("Tersedia");
        System.out.println("Harga Buku: 50k");

            break;
        case "Buku E":
        System.out.println("Buku E Tersedia");
        System.out.println("Penulis: Si E");
        System.out.println("Tersedia");
        System.out.println("Harga Buku: 30k");

            break;
        case "Buku F":
        System.out.println("Buku F Tersedia");
        System.out.println("Penulis: Si F");
        System.out.println("Tersedia");
        System.out.println("Harga Buku: 90k");

            break;
        default: 
        System.out.println("buku tidak tersedia");
        }
       
        System.out.println("Masukkan Nama Buku yang ingin dibeli : ");
        namaBuku = input.nextLine();
        System.out.println("Apakah Anda ingin membeli buku ini (ya/tidak) ? ");
        beli = input.nextLine();
        hargaBuku = 50000 ;
        if (beli.equals("ya")) {
            System.out.println("Apakah Anda berlangganan (ya/tidak) ? ");
            berlangganan = input.nextLine();
            if (berlangganan.equals("ya")) {
                disc = 0.2;
                potHarga = (int) (hargaBuku * disc );
                hargaBayar = (int) (hargaBuku - potHarga);
                

                System.out.println("Selamat Anda Mendapatkan Potongan Harga sebesar = " + potHarga);
                System.out.println("Harga Buku yang harus Anda bayarkan sebesar = " + hargaBayar);
            } else if (berlangganan.equals("tidak"))
                
                System.out.println("Harga Buku yang Harus Anda Bayarkan : " + hargaBuku);

            
        } else if (beli.equals("tidak")) {
            System.out.println("_________________________________________");
            System.out.println("Selamat Datang di Menu Utama Perpustakaan");
            System.out.println("_________________________________________");
        } else 
            System.out.println(" Mohon Ketikkan 'ya' atau 'tidak' !!!");
    }
}
