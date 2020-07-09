import java.util.ArrayList;

/**
 * The type Tierheim.
 */
public class Tierheim
{
    private Tier tier;

    /**
     * The Tierheim.
     */
    ArrayList<Tier> tierheim = new ArrayList<Tier>();


    /**
     * Add.
     *
     * @param tier the tier
     */
    public void add(Tier tier)
    {
        tierheim.add(tier);
    }


    /**
     * Laenge.
     */
    public void laenge()
    {
        int size = tierheim.size();
    System.out.println(" Anzahl Elemente: "+size);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {

        Tierart Hund1 = new Tierart("Hund",4);
        Tier hund1 = new Tier(Hund1);

        Tierart Hund2 = new Tierart("Hund",4);
        Tier hund2 = new Tier(Hund2);

        Tierart Spinne1 = new Tierart("Spinne",8);
        Tier spinne1 = new Tier(Spinne1);

        Tierart Spinne2 = new Tierart("Spinne",8);
        Tier spinne2 = new Tier(Spinne2);

        Tierart Spinne3 = new Tierart("Spinne",8);
        Tier spinne3 = new Tier(Spinne3);

        Tierart Fisch1 = new Tierart("Fisch",0);
        Tier fisch1 = new Tier(Fisch1);

        Tierart Fisch2 = new Tierart("Fisch",0);
        Tier fisch2 = new Tier(Fisch2);

        Tierheim tierheim = new Tierheim();
        tierheim.add(hund1);
        tierheim.add(hund2);
        tierheim.add(spinne1);
        tierheim.add(spinne2);
        tierheim.add(spinne3);
        tierheim.add(fisch1);
        tierheim.add(fisch2);
        tierheim.laenge();

    }

}
