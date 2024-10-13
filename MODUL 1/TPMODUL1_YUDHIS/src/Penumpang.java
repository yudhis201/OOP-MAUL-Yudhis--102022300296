public class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    // Constructor
    public Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    // Getter untuk semua atribut
    public String getNIK() {
        return NIK;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    // Method untuk menampilkan daftar penumpang
    public void tampilDaftarPenumpang() {
        System.out.println("NIK: " + NIK);
        System.out.println("Nama: " + namaDepan + " " + namaBelakang);
        System.out.println();
    }

    // Main method untuk uji coba class Penumpang
    public static void main(String[] args) {
        // Membuat instance Penumpang untuk diuji
        Penumpang penumpang1 = new Penumpang("1234567890", "Bagas", "A1");
        Penumpang penumpang2 = new Penumpang("0987654321", "Dita", "B2");

        // Menampilkan informasi penumpang
        penumpang1.tampilDaftarPenumpang();
        penumpang2.tampilDaftarPenumpang();
    }
}

