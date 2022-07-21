public class Ogrenci {
    private int id;
    private String firsName;
    private String lastName;
    private Kurs kurs;

    public Ogrenci(){

    }

    public Ogrenci(int id,String firstName,String lastName,Kurs kurs){
        this.id =id;
        this.firsName = firstName;
        this.lastName = lastName;
        this.kurs = kurs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }
}
