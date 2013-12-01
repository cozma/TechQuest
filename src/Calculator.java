// -------------------------------------------------------------------------
/**
 *  Calculator Class
 *
 *  @author Kevin Olsoln
 *  @version Dec 4, 2012
 */
public class Calculator
{
    private int calculator = 0;

    // ----------------------------------------------------------
    /**
     * Create a new Calculator object.
     */
    public Calculator()
    {
        //empty
    }
    // ----------------------------------------------------------
    /**
     * Increases number of calculators
     */
    public void calcIncrease()
    {
        calculator = calculator +1;
    }

    // ----------------------------------------------------------
    /**
     * Decreases number of calculators
     */
    public void calcDecrease()
    {
        if(calculator >0)
        {
        calculator--;
        }
    }

    // ----------------------------------------------------------
    /**
     * Returns the number of calculators
     * @return the num of calculators
     */
    public int returnCalc()
    {
        return calculator;
    }

}
