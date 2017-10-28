import java.io.*;
import java.text.*;
import java.io.IOException;
public class FacadePatternDevelopment
{
	static int choice=0;
	public static void main(String args [])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		do
		{
		System.out.println(" 1. IPHONES  ");
		System.out.println(" 2. SAMSUNG  ");
		System.out.println(" 3. WINDOWS  ");
		System.out.println(" 4. EXIT  ");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println(" Enter phone of your choice ");
		choice=Integer.parseInt(br.readLine());
		ShopKeeper keeper=new ShopKeeper();
		
		
		
			switch(choice)
			{
			case 1:
			{
				keeper.iphoneSale();
			}
			break;
			case 2:
			{
			   keeper.samsungSale();	
			}
			break;
			case 3:
			{
			   keeper.windowsSale();	
			}
			break;
			
			default:
			{
				System.out.println(" Nothing you purchased");
			}
			return;
			}
		}while(choice!=4);
	}

}
