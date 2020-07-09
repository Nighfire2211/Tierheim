/**
 * The type Tierart.
 */
public class Tierart {

    private int anzahlBeine;
    private String name;

    /**
     * Instantiates a new Tierart.
     *
     * @param n the n
     * @param b the b
     */
    public Tierart(String n, int b)
    {
        setAnzahlBeine(b);
        setName(n);

        alleDatenAusgaben(n,b);
    }

    /**
     * Gets anzahl beine.
     *
     * @return the anzahl beine
     */
    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    /**
     * Sets anzahl beine.
     *
     * @param anzahlBeine the anzahl beine
     */
    public void setAnzahlBeine(int anzahlBeine) {
        this.anzahlBeine = anzahlBeine;
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

    /**
     * Alle daten ausgaben.
     *
     * @param name        the name
     * @param anzahlBeine the anzahl beine
     */
    public void alleDatenAusgaben(String name,int anzahlBeine)
    {

        System.out.println("Tierart: "+name+" Anzahl Beine: "+anzahlBeine);
    }
}