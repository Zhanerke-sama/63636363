package Planet;

public class Continent extends Planet {
    String name2;
    int kol;
    public String getName2() {
        return name2;
    }
    public void setName2(String name2) {
        this.name2 = name2;
    }
    public int getKol() {
        return kol;
    }
    public void setKol(int kol) {
        this.kol = kol;
    }
    public Continent(String name, String name2, int kol) {
        super(name);
        this.name2 = name2;
        this.kol = kol;
    }
    @Override
    public String toString() {
        return "Continent [name2=" + name2 + ", kol=" + kol + ", name=" + name + "]";
    }


}
