public class Main {
    public static void main(String[] args) {
        Category category1 = new Category();
        category1.setId(1);
        category1.setCategoryTuru("Programlama");
        category1.setToplamKurs(4);
        System.out.println(category1.getId());
        System.out.println(category1.getCategoryTuru());
        System.out.println(category1.getToplamKurs());

        Egitmen egitmen1 = new Egitmen();
        egitmen1.setId(1);
        egitmen1.setFirstName("Engin");
        egitmen1.setLastName("Demirog");
        egitmen1.setKursSayisi(1);
        System.out.println(egitmen1.getId());
        System.out.println(egitmen1.getFirstName());
        System.out.println(egitmen1.getLastName());
        System.out.println(egitmen1.getKursSayisi());

        Kurs kurs1 = new Kurs();
        kurs1.setId(1);
        kurs1.setKursAdi("Yazılım Geliştirici Yetiştirme Kampı");
        kurs1.setCategory(category1);
        kurs1.setEgitmen(egitmen1);
        kurs1.setTamamlanma(1);
        kurs1.setToplamOgrenci(100);
        System.out.println(kurs1.getId());
        System.out.println(kurs1.getKursAdi());
        System.out.println(kurs1.getCategory().getCategoryTuru());
        System.out.println(kurs1.getEgitmen().getFirstName());
        System.out.println(kurs1.getTamamlanma());
        System.out.println(kurs1.getToplamOgrenci());

        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.setId(1);
        ogrenci1.setFirsName("Gokberk");
        ogrenci1.setLastName("Uguz");
        ogrenci1.setKurs(kurs1);
        OgrenciManager ogrenciManager = new OgrenciManager();
        ogrenciManager.add(ogrenci1);
        System.out.println(ogrenci1.getId());
        System.out.println(ogrenci1.getFirsName());
        System.out.println(ogrenci1.getLastName());
        System.out.println(ogrenci1.getKurs().getKursAdi());

        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci2.setId(2);
        ogrenci2.setFirsName("Rabia");
        ogrenci2.setLastName("Çakır");
        ogrenci2.setKurs(kurs1);
        ogrenciManager.add(ogrenci2);

        Ogrenci ogrenci3 = new Ogrenci(3,"Elif","Çelik",kurs1);
        ogrenciManager.add(ogrenci3);

        for (Ogrenci ogrenci:ogrenciManager.ogrenciListele()){
            System.out.println(ogrenci.getId());
            System.out.println(ogrenci.getFirsName());
            System.out.println(ogrenci.getLastName());
            System.out.println(ogrenci.getKurs().getKursAdi());
        }
        System.out.println(ogrenci2.getId());
        System.out.println(ogrenci2.getFirsName());
        System.out.println(ogrenci2.getLastName());
        System.out.println(ogrenci2.getKurs().getKursAdi());

        User user1 = new User();
        user1.setId(1);
        user1.setUserName("human");
        user1.setPassword("1234");
        System.out.println(user1.getId());
        System.out.println(user1.getPassword());
        System.out.println(user1.getUserName());


    }
}