package pizza_delivery;

import java.io.IOException;
import java.util.Scanner;
import pizza_delivery.Taxing;

public class HuntMain extends Menu_Card
{
	public static void main(String[] args)throws IOException,ArrayIndexOutOfBoundsException
	{
		int i,j;
		int total=0;
		int items = 0  ;
		int resto_wanted;
		int Distance;
		Resto_hunter ob=new Resto_hunter();
		Menu_Card obj=new Menu_Card();
		Pizza_hut ph=new Pizza_hut();
		Dominos dm=new Dominos();
       Papa_johns pj=new Papa_johns();
       Thank_you tk=new Thank_you();
       Taxing tx=new Taxing();
       Locating lc=new Locating();
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the resto number: ");
		System.out.println( "Pizza hut is 1");
		System.out.println( "Dominos is 2");
		System.out.println("Papa johns is 3");
		resto_wanted=sc.nextInt();
		System.out.println("-----------------------RESTAURANT PREFERRED------------------------");
		if(resto_wanted==1)
		{
			ph.resto_details();
		}
		else if(resto_wanted==2)
		{
			dm.resto_details();
		}
		else if(resto_wanted==3)
		{
			pj.resto_details();
		}
		else
		{
			throw new IOException("Check ur input");
		}
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Enter ur location number");
		System.out.println("1 for Kasavanahalli");
		System.out.println("2 for whitefield");
		System.out.println("3 for Rajajinagar");
		System.out.println("4 for Hosur");
		Distance=sc.nextInt();
		lc.Distance_cal(Distance);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Enter the size of pizza: ");
		System.out.println("1 for small");
		System.out.println("2 for regular");
		System.out.println("3 for large");
		size=sc.nextInt();
		System.out.println("----------------------MENU CARD--------------------------------------------");
		obj.size_method(size);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("HOW MANY ITEMS YOU WANT: ");
		i=sc.nextInt();
       System.out.println("Select the items numbers you want");
       for(j=1;j<=i;j++)
       {
    	   items=sc.nextInt()-1;
    	   System.out.println(food_items[items]);
    	   if(size==1)
    	   {
    	   	obj.smallCost();
    	   	   System.out.println(cost[items]+" Rs");
    	   	  total=total+cost[items];
    	   }
    	   else if(size==2)
    	   {
    		   obj.RegularCost();
    		   System.out.println(cost[items]+" Rs"); 
    		   total=total+cost[items];
    	   }
    	   else if(size==3)
    	   {
    		   obj.LargeCost();
    		   System.out.println(cost[items]+" Rs");
    		   total=total+cost[items];
    	   }
    	   else
    	   {
    		   throw new ArrayIndexOutOfBoundsException("Please enter valid input");
    	   }
       }
	 System.out.println("---------------------------------BILL------------------------------------------------------");
	   System.out.println("Your amount is: "+total+" Rs");
	   if(total>=70&&total<=200)
	   {
		   tx.Taxing(total);
	   }
	   else if(total>200&&total<=600)
	   {
		   tx.Taxing(total,30);
	   }
	   else if(total>600&&total<=1000)
	   {
		   tx.Taxing(total,30,18);
	   }
	   else
	   {
     System.out.println ("No taxing required");
	   }
	   tk.thank();
	System.out.println("----------------------------------------------------------------------------------------------");
		
	}

}
