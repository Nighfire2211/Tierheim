import java.util.ArrayList;

/**
 * The type Tier.
 */
public class Tier
{
    private Tierart tierart;
    private String name;

    /**
     * Instantiates a new Tier.
     *
     * @param t the t
     */
    public Tier(Tierart t)
    {
        setTierart(t);
        t.alleDatenAusgaben(t.getName(),t.getAnzahlBeine());

    }

    /**
     * Gets tierart.
     *
     * @return the tierart
     */
    public Tierart getTierart() {
        return tierart;
    }

    /**
     * Sets tierart.
     *
     * @param tierart the tierart
     */
    public void setTierart(Tierart tierart) {
        this.tierart = tierart;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }



}
