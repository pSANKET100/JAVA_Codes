public class Fahrenheit
{
	public static void main (String args[])
	{
		float fah,celsius;
		fah = Float.parseFloat(args[0]);
		celsius = (fah -32)*5/9;
		System.out.println("Temperature of = "+celsius);
	}
}
		
		