package Planet;

public class Planet {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Planet(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet [name=" + name + "]";
    }


}
