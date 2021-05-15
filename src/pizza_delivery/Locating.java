package pizza_delivery;

import java.io.IOException;

public class Locating 
{
	int  measure;
	int time_taken;
	int distancing;
	public void Distance_cal(int a)throws IOException
	{
		measure =a;
		if(measure==1)
		{
			distancing=10;
			time_taken=distancing*6;
			System.out.println("The distance is: "+distancing+ " km and delivery in "+time_taken+" min");
		}
		else if(measure==2)
		{
			distancing=20;
			time_taken=(distancing*6);
			System.out.println("The distance is: "+distancing+ " km and delivery in "+time_taken+" min");
		}
		else if(measure==3)
		{
			distancing=15;
			time_taken=(distancing*6);
			System.out.println("The distance is: "+distancing+ " km and delivery in "+time_taken+" min");
		}
		else if(measure==4)
		{
			distancing=2;
			time_taken=(distancing*6);
			System.out.println("The distance is: "+distancing+ " km and delivery in "+time_taken+" min");
		}
		else
		{
			throw new IOException ("The distance is very far,  hence delivery not possible");
		}
	}

}
