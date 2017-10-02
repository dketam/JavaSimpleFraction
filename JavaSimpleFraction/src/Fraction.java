
public class Fraction {
private double numer,denume;
	
	public Fraction(double num, double denum)
	{
		this.numer = num;
		this.denume = denum;
	}
	
	public Fraction()
	{
		this(0, 0);
	}
	
	@Override
	public String toString()
	{
		return Double.valueOf(numer).toString() + " " + Double.valueOf(denume).toString();
	}
	
}
