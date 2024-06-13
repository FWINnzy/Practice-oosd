
/**
 * Write a description of class Coffee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Coffee
{
    // instance variables - replace the example below with your own
    ingredient i;
    making m;
    abstract void display();
    
    public void ingre(){
     i.in();
    }
    public void makee(){
    System.out.println("วิธีทำ");
    m.make();
    System.out.println("-------------------------");
    }
}
