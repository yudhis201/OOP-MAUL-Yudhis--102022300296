import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        // ArrayList untuk menyimpan daftar penerbangan
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();

        // Menambahkan data penerbangan ke dalam daftar
        daftarPenerbangan.add(new Penerbangan("GA123", "Jakarta", "Surabaya", "10:00", "12:00", 1200000));
        daftarPenerbangan.add(new Penerbangan("GA456", "Jakarta", "Bali", "15:00", "17:30", 1500000));
        daftarPenerbangan.add(new Penerbangan("GA789", "Jakarta", "Medan", "18:00", "20:30", 1300000));

        // Scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);

        // Menampilkan daftar penerbangan yang tersedia
        System.out.println("Daftar Penerbangan yang Tersedia:");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPenerbangan.get(i).getNomorPenerbangan());
            daftarPenerbangan.get(i).tampilDaftarPenerbangan();
        }

        // Meminta user memasukkan data penumpang
        System.out.println("Masukkan data penumpang:");
        System.out.print("NIK: ");
        String NIK = input.nextLine();
        System.out.print("Nama Depan: ");
        String namaDepan = input.nextLine();
        System.out.print("Nama Belakang: ");
        String namaBelakang = input.nextLine();

        // Membuat objek penumpang berdasarkan input
        Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

        // Meminta user untuk memilih penerbangan
        System.out.print("Pilih nomor penerbangan yang ingin dipesan (1-" + daftarPenerbangan.size() + "): ");
        int pilihan = input.nextInt();

        // Menampilkan detail pesanan tiket
        System.out.println("\nDetail Pesanan:");
        penumpang.tampilDaftarPenumpang();
        System.out.println("Penerbangan yang dipilih:");
        daftarPenerbangan.get(pilihan - 1).tampilDaftarPenerbangan();

        // Menutup Scanner
        input.close();
    }
}
