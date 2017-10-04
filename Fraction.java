/**
 * Décrivez votre classe Fraction ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Fraction implements Comparable<Fraction>
{
    private final int numerateur;
    private final int denummerateur;
    
    public static Fraction ZERO = new Fraction();
    public static Fraction UN = new Fraction(1, 1);

    public Fraction(int num, int denum)
    {
		  this.num = num;
        if(denum == 0) {
            throw new ArihtmeticException();
        }
        this.denum = denum;
    }
      
}
