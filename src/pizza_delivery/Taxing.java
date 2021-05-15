package pizza_delivery;

public final class Taxing 
{
	int amount;
	int total=0;
	public  void Taxing(int a)
	{
		int Tax;
		amount =a;
		Tax=(int) (0.2*amount);
		System.out.println("GST: "+Tax+" Rs");
		total=amount +Tax;
		System.out.println("Your bill amount including all tax is: "+total+" Rs");
	}
	public void Taxing(int c,int b)
	{
		int Tax ;
		amount=c;
		Tax=(int) (0.2*amount);
		int swach_bharat_tax=b;
		total=amount +Tax+swach_bharat_tax;
		System.out.println("GST: "+Tax+" Rs");
		System.out.println("Swachh bharat tax: "+swach_bharat_tax+" Rs");
		System.out.println("Your bill amount including all tax is: "+total+" Rs");
	}
	public void Taxing(int e,int f,int s)
	{
		int Tax;
		amount=e;
		Tax=(int) (0.2*amount);
		int swach_bharat_tax=f;
		int cleaning=s;
		total=amount +Tax+swach_bharat_tax+cleaning;
		System.out.println("GST: "+Tax+" Rs");
		System.out.println("Swachh bharat tax: "+swach_bharat_tax+" Rs");
		System.out.println("Servive tax: "+cleaning+" Rs");
		System.out.println("Your bill amount including all tax is: "+total+" Rs");
	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                  