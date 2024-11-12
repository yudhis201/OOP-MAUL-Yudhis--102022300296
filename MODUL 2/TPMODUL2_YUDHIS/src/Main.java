public class Main {
    public static void main(String[] args) {
        
        Hewan hewanUmum = new Hewan("Hewan Umum", 5);
        Kucing kucing = new Kucing("Tom", 3, "Anggora");
        Burung burung = new Burung("Tweety", 2, "Kuning");

        
        hewanUmum.suara();
        hewanUmum.makan("daging");
        hewanUmum.infoHewan();

        System.out.println(".()");

        
        kucing.suara();
        kucing.makan("ikan");
        kucing.infoHewan();

        System.out.println();

        
        burung.suara();
        burung.makan("biji-bijian");
        burung.infoHewan();
    }
}
