import java.util.ArrayList;
import java.util.List;

public class OgrenciManager {
    private List<Ogrenci> ogrenciListesi = new ArrayList<>();

    public void add(Ogrenci ogrenci) {
        ogrenciListesi.add(ogrenci);
        System.out.println(ogrenci.getFirsName() + ": eklendi");
    }

    public List<Ogrenci> ogrenciListele() {
        return ogrenciListesi;
    }
}

