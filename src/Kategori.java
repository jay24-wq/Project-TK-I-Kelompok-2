public class Kategori {
  private int idKategori;
  private String namaKategori;

  public Kategori(int idKategori, String namaKategori) {
    this.idKategori = idKategori;
    this.namaKategori = namaKategori;
  }

  public int getIdKategori() {
    return idKategori;
  }

  public String getNamaKategori() {
    return namaKategori;
  }

  public void setNamaKategori(String namaKategori) {
    this.namaKategori = namaKategori;
  }

  @override
  public String toString() {
    return this.namaKategori;
  }
}
