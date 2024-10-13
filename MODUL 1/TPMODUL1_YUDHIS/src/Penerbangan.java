public class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    
    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, 
                       String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }

    
    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String getBandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public String getWaktuKedatangan() {
        return waktuKedatangan;
    }

    public float getHargaTiket() {
        return hargaTiket;
    }

    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("Keberangkatan: " + bandaraKeberangkatan + " | Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan + " | Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Harga Tiket: Rp" + hargaTiket);
        System.out.println();
    }

    
    public static void main(String[] args) {
        
        Penerbangan penerbangan1 = new Penerbangan("GA123", "Jakarta", "Surabaya", "10:00", "12:00", 1200000);
        Penerbangan penerbangan2 = new Penerbangan("GA456", "Jakarta", "Bali", "15:00", "17:30", 1500000);

        
        penerbangan1.tampilDaftarPenerbangan();
        penerbangan2.tampilDaftarPenerbangan();
    }
}








