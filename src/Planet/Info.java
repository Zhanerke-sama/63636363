package Planet;

public class Info {
    public static Planet[] createArrayOfPlanets(Planet[] p) {
        p[0]=new Continent("Zemlya","Asia",7);
        p[1]=new Continent("Zemlya","Africa",7);
        p[2]=new Continent("Jupiter","South America",5);
        p[3]=new Continent("Saturn","N.A",45);
        p[4]=new Continent("Mercury","Australia",5);
        return p;
    }
    public void printPalnet(Planet[] p ) {
        for (int i = 0; i < p.length; i++)
            System.out.println(p[i].toString());
    }

}
