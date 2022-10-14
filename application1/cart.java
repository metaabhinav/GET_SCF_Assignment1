package application1;
import java.util.*;
public class cart {

	HashMap<item,Integer>map=new HashMap<>();
	
	public void addtocart(item itemmid,int quantity) {
		map.put(itemmid,quantity);
	}
	public void printcart() {
		for(Map.Entry<item,Integer>e:map.entrySet()) {
			System.out.println(e);
		}
	}
	public void showquantity(item idd) {
		System.out.println("Quantity of the item entereed is"+map.get(idd));
	}
	public void updateQty(item idd, int quan) {
		map.put(idd, quan);
		System.out.println("Successfully Updated the items");
		
	}
	public void deleteitm(item idd) {
		map.remove(idd);
		System.out.println("Successfully Deleted the item ");
	}
	public double displayBill() {
		double a=0;
		for(Map.Entry<item,Integer>e:map.entrySet()) {
			int mon=e.getKey().getPrice();
			mon=mon*e.getValue();
			a=a+mon;
//			int k=ob1.getPrice();
			
		}
		return a;
	}
}
