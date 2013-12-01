// -------------------------------------------------------------------------
/**
 *Pencil class
 *
 *  @author Kevin Olson
 *  @version Dec 4, 2012
 */
public class Pencil
{
    private int pencil=0;

    // ----------------------------------------------------------
    /**
     * Create a new Pencil object.
     */
    public Pencil()
    {
        //empty
    }

    // ----------------------------------------------------------
    /**
     * Increases pencil
     */
    public void pencilIncrease()
    {
        pencil = pencil +1;
    }

    // ----------------------------------------------------------
    /**
     * Decreases pencil
     */
    public void pencilDecrease()
    {
        if(pencil >0)
        {
        pencil --;
        }
    }

    // ----------------------------------------------------------
    /**
     * Returns the number of pencils a user has
     * @return number of pencils
     */
    public int returnPencil()
    {
        return pencil;
    }

}
