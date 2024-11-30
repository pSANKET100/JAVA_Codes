public class Subcal
{
	public static void main (String args[])
		{
			int math,eng,sci,phy,bio,total;	
			float per;
			math = Integer.parseInt(args[0]);
			eng = Integer.parseInt(args[1]);
			sci = Integer.parseInt(args[2]);
			phy = Integer.parseInt(args[3]);
			bio = Integer.parseInt(args[4]);
			
			total = math + eng + sci + phy + bio;
			System.out.println("Sub total is = "+total);
			
			per = (total/5)*100;
			System.out.println("Percentage is = "+per+"%");
			
		}
}