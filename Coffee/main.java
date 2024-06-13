
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    // instance variables - replace the example below with your own
    public static void main(){
        Coffee c = new Espresso();
        c.display();
        c.ingre();
        c.makee();
        Coffee c1 = new Americano();
        c1.display();
        c1.ingre();
        c.makee();
        Coffee c2 = new Darknight();
        c2.display();
        c2.ingre();
        c2.makee();
        Coffee c3 = new Oyour();
        c3.display();
        c3.ingre();
        c3.makee();
    }
}
