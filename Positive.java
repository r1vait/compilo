
/**
 * Write a description of class Add here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Positive extends Exp
{
    // instance variables - replace the example below with your own
    private Exp e;
   

    /**
     * Default constructor for objects of class Add
     */
    public Positive(Exp p_exp)
    {
        // initialise instance variables
        this.e = p_exp;
        super.setType(Type.INT);
    } // Add()

    public void accept(Visitor v){
        v.visit(this);
    }
    
    public Exp getExp(){return this.e;}
} // Add
