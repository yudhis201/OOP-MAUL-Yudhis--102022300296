import java.util.ArrayList;
import java.util.Scanner;

// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();

    public void tambahMakananKering() {
        Scanner scanner = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.println("Masukkan nama makanan kering:");
        String nama = scanner.nextLine();
        System.out.println("Masukkan jumlah makanan kering:");
        int jumlah = scanner.nextInt();
        System.out.println("Masukkan harga makanan kering:");
        double harga = scanner.nextDouble();
        scanner.nextLine();  // Consume newline left-over
        System.out.println("Masukkan brand makanan kering:");
        String brand = scanner.nextLine();
        
        
        MakananKering makananKering = new MakananKering(nama, jumlah, harga, brand);
        daftarMakananKering.add(makananKering);
        
        System.out.println("Makanan kering berhasil ditambahkan");
    }

    public void tambahMakananBasah() {
        Scanner scanner = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.println("Masukkan nama makanan basah:");
        String nama = scanner.nextLine();
        System.out.println("Masukkan jumlah makanan basah:");
        int jumlah = scanner.nextInt();
        System.out.println("Masukkan harga makanan basah:");
        double harga = scanner.nextDouble();
        scanner.nextLine();  // Consume newline left-over
        System.out.println("Masukkan bahan makanan basah:");
        String bahan = scanner.nextLine();
        
        MakananBasah makananBasah = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(makananBasah);
        
       
        System.out.println("Makanan basah berhasil ditambahkan");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            
            System.out.println("Tidak ada makanan disini");
        } else {
            
            System.out.println("Daftar Makanan Kering:");
            for (MakananKering makananKering : daftarMakananKering) {
                System.out.println(makananKering);
            }
            
            
            System.out.println("Daftar Makanan Basah:");
            for (MakananBasah makananBasah : daftarMakananBasah) {
                System.out.println(makananBasah);
            }
        }
    }


    class MakananKering {
        String nama;
        int jumlah;
        double harga;
        String brand;

        public MakananKering(String nama, int jumlah, double harga, String brand) {
            this.nama = nama;
            this.jumlah = jumlah;
            this.harga = harga;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Nama: " + nama + ", Jumlah: " + jumlah + ", Harga: " + harga + ", Brand: " + brand;
        }
    }

    
    class MakananBasah {
        String nama;
        int jumlah;
        double harga;
        String bahan;

        public MakananBasah(String nama, int jumlah, double harga, String bahan) {
            this.nama = nama;
            this.jumlah = jumlah;
            this.harga = harga;
            this.bahan = bahan;
        }

        @Override
        public String toString() {
            return "Nama: " + nama + ", Jumlah: " + jumlah + ", Harga: " + harga + ", Bahan: " + bahan;
        }
    }
}
