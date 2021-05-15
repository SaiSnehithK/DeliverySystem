package pizza_delivery;

import java.util.Scanner;
interface pizza_size
{
	void items_list();
	  void cost_small();
	  void cost_regular();
	  void cost_large();
}
interface size_cost
{
	void smallCost();
    void RegularCost();
    void LargeCost();
}

 public class Menu_Card implements pizza_size,size_cost
{
   static int[] cost=new int[10];
   static String[] food_items=new String[10];
   public void items_list()
   {
	   food_items[0]="1) Garlic bread";  food_items[1]="2) Choco lava";  food_items[2]="3) Cheesy dip";  food_items[3]="4) Regular cheesy pizza"; food_items[4]="5) Italiano pizzza ";
		 food_items[5]="6) Chicken cheesy  pizza";  food_items[6]="7) Margherita pizza";  food_items[7]="8) Farm house pizza";  food_items[8]="9) Country special pizza";  food_items[9]="10) Mushroom onion pizza";   
   }
   
   
   public void smallCost()
   {
	   cost[0]=70;   cost[1]=80;  cost[2]=48;  cost[3]=112;  cost[4]=172;  cost[5]=210;
	   cost[6]=180;  cost[7]=180;  cost[8]=150;  cost[9]=190;
   }
   public  void cost_small()
   {
	    items_list();
      smallCost();
	   for (int i = 0;i<=9;i++)
	   {
	   System.out.println(food_items[i]+"---- "+cost[i]+" Rs");
   } }
   
   
   public void RegularCost()
   {
	   cost[0]=70;     cost[1]=80;   cost[2]=48;   cost[3]=162;   cost[4]=212;  cost[5]=260;
	   cost[6]=232;   cost[7]=232;   cost[8]=200;   cost[9]=230;
   }
	   public  void cost_regular()
	   {
			 items_list();	
            RegularCost();
		   for (int j = 0;j<=9;j++)
		   {
		   System.out.println(food_items[j]+"----"+cost[j]+" Rs");
	   } }
	   
	   
	   public void LargeCost()
	   {
		   cost[0]=70;  cost[1]=80;  cost[2]=48;  cost[3]=200;  cost[4]=250;  cost[5]=300;
		   cost[6]=270;  cost[7]=270;  cost[8]=240;  cost[9]=270;
	   } 
	   public void cost_large()
	   {
		 items_list();	
        LargeCost();
		   for (int k = 0;k<=9;k++)
		   {
		   System.out.println(food_items[k]+"----"+cost[k]+" Rs");
		   }}
	   
	   
	  public final void size_method(int size)
	  {
			if(size==1)
			{
			cost_small();
			}
			if(size==2)
			{
				cost_regular();
			}
			if(size==3)
			{
				cost_large();
			}
	  }}


   


