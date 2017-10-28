
public class ShopKeeper 
{
     private MobileShop iphone;
     private MobileShop samsung;
     private MobileShop windows;
     
     public ShopKeeper()
     {
    	 iphone=new Iphones();
    	 samsung=new Samsung();
    	 windows=new Windows();
     }
     
     public void iphoneSale()
     {
    	 iphone.getPhone();
    	 iphone.price();
     }
     public void samsungSale()
     {
    	 samsung.getPhone();
    	 samsung.price();
     }
     public void windowsSale()
     {
    	 windows.getPhone();
    	 windows.price();
     }
}
