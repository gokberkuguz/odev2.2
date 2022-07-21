public class Kurs {
    private int id;
    private String kursAdi;
    private Category category;
    private Egitmen egitmen;
    private float tamamlanma;
    private int toplamOgrenci;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public void setKursAdi(String kursAdi) {
        this.kursAdi = kursAdi;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Egitmen getEgitmen() {
        return egitmen;
    }

    public void setEgitmen(Egitmen egitmen) {
        this.egitmen = egitmen;
    }

    public float getTamamlanma() {
        return tamamlanma;
    }

    public void setTamamlanma(float tamamlanma) {
        this.tamamlanma = tamamlanma;
    }

    public int getToplamOgrenci() {
        return toplamOgrenci;
    }

    public void setToplamOgrenci(int toplamOgrenci) {
        this.toplamOgrenci = toplamOgrenci;
    }
}
