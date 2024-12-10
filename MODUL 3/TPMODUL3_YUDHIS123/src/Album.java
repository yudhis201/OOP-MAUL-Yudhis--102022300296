package zeppeliapp;

public class Album {
   private String albumName;
   private String artist;
   private int total;
   private int available;
   private int rented;

   public Album(String var1, String var2, int var3, int var4, int var5) {
      this.albumName = var1;
      this.artist = var2;
      this.total = var3;
      this.available = var4;
      this.rented = var5;
   }

   public String getAlbumName() {
      return this.albumName;
   }

   public void setAlbumName(String var1) {
      this.albumName = var1;
   }

   public String getArtist() {
      return this.artist;
   }

   public void setArtist(String var1) {
      this.artist = var1;
   }

   public int getTotal() {
      return this.total;
   }

   public void setTotal(int var1) {
      this.total = var1;
   }

   public int getAvailable() {
      return this.available;
   }

   public void setAvailable(int var1) {
      this.available = var1;
   }

   public int getRented() {
      return this.rented;
   }

   public void setRented(int var1) {
      this.rented = var1;
   }
}
