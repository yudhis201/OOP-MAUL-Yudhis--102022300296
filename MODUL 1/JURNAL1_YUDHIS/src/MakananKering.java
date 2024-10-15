// Don't delete any comments below!!!

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String nama;
    private String jumlah;
    private String harga;
    private String brand;

    // Todo : Create Constructor of MakananKering
    public MakananKering(String brand, String harga, String jumlah, String nama) {
        this.brand = brand;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    

    // Todo : Create Method ShowData
    public void ShowData() {
        System.out.println("nama: "+ nama);
        System.out.println("jumlah"+ jumlah);
        System.out.println("harga"+ harga);

    }

    

   

    

}
