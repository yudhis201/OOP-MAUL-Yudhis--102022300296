// Don't delete any comments below!!!
public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String nama;
    private String jumlah;
    private String harga;
    private String bahan;

    // Todo : Create Constructor of MakananBasah

    public MakananBasah(String bahan, String harga, String jumlah, String makanankering, String nama) {
        this.bahan = bahan;
        this.harga = harga;
        this.jumlah = jumlah;
        this.nama = nama;
    }
    

    // Todo : Create Getter and Setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
// Todo : Create Method ShowData
    public void ShowData() {
        System.out.println("nama:" + nama);
        System.out.println("jumlah"+ jumlah);
        System.out.println("harga"+ harga);
        System.out.println("Bahan"+ bahan);

    }
    
}

    // Todo : Create Method ShowData
    

    