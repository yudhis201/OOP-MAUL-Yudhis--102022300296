
public class Makanan {

    private String nama;
    private String jumlah;
    private String harga;
    
 // Todo : Create Constructor of Makanan
    public Makanan(String bahan, String harga, String jumlah, String nama) {;
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

    
    public void ShowData(){
        System.out.println("nama"+ nama);
        System.err.println("jumlah"+ jumlah);
        System.err.println("harga"+ harga);

    }
    



}
    





