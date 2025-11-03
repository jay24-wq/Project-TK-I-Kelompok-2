public class Produk {
  private int idProduk;
  private String namaProduk;
  private double harga;

  public Produk(int idProduk, String namaProduk, double harga) {
    this.idProduk = idProduk;
    this.namaProduk = namaProduk;
    this.harga = harga;
  }

  public int getIdProduk() {
    return idProduk;
  }

  public String getNamaProduk() {
    return namaProduk;
  }

  public double getHarga() {
    return harga;
  }

  public void setNamaProduk(String namaProduk) {
    this.namaProduk = namaProduk;
  }

  public void setHarga(double harga) {
    this.harga = harga;
  }
}
