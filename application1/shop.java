package application1;
import java.util.*;
public class shop {
public static void main(String args[]) {
		Scanner sd=new Scanner(System.in);
		item ob=new item(1,"earphones","goodone",50);
		item ob1=new item(2,"headphones","goodone",60);
		item ob2=new item(3,"keyboard","goodone",70);
		item ob3=new item(4,"adapter","goodone",80);
		item ob4=new item(5,"mouse","goodone",90);
//		System.out.println(ob.itemid);
//		int k=ob3.getitemid();
//		System.out.println(k);
		
		cart trolley=new cart();
		int itemmid, quantity;
		while(true) {
			System.out.print("Which item you want to add and in which quantity  ");
			itemmid=sd.nextInt();
			quantity=sd.nextInt();
			if(itemmid==1) {
				trolley.addtocart(ob,quantity);
			}
			else if(itemmid==2) {
				trolley.addtocart(ob1,quantity);
			}
			else if(itemmid==3) {
				trolley.addtocart(ob2,quantity);
			}
			else if(itemmid==4) {
				trolley.addtocart(ob3,quantity);
			}
			else if(itemmid==5) {
				trolley.addtocart(ob4,quantity);
			}
			System.out.println("You want to add more? if yes enter 1 else 0");
			int num=sd.nextInt();
			if(num==0) {
				break;
				}
		}
		trolley.printcart();//printing cart
		while(true) {
		System.out.println("Enter the operation you want to do");
		System.out.println("1. Show quantity of items");
		System.out.println("2. Update quantity of items");
		System.out.println("3. Delete items");
		System.out.println("4. Display Cart Total Value");
		int op=sd.nextInt();
		if(op==1) {
			System.out.println("Enter the itemid of the item");
			itemmid=sd.nextInt();
			if(itemmid==1) {
				trolley.showquantity(ob);
			}
			else if(itemmid==2) {
				trolley.showquantity(ob1);
			}
			else if(itemmid==3) {
				trolley.showquantity(ob2);
			}
			else if(itemmid==4) {
				trolley.showquantity(ob3);
			}
			else if(itemmid==5) {
				trolley.showquantity(ob4);
			}
			
			}
		else if(op==2) {
			System.out.println("Enter the item id of the item");
			itemmid=sd.nextInt();
			System.out.println("Enter the updated quantity");
			int quan=sd.nextInt();
			if(itemmid==1) {
				trolley.updateQty(ob,quan);
			}
			else if(itemmid==2) {
				trolley.updateQty(ob1,quan);
			}
			else if(itemmid==3) {
				trolley.updateQty(ob2,quan);
			}
			else if(itemmid==4) {
				trolley.updateQty(ob3,quan);
			}
			else if(itemmid==5) {
				trolley.updateQty(ob4,quan);
			}
			
		}
		else if(op==3) {
			System.out.println("Enter the item id that you want to get deleted");
			itemmid=sd.nextInt();
			if(itemmid==1) {
				trolley.deleteitm(ob);
			}
			else if(itemmid==2) {
				trolley.deleteitm(ob1);
			}
			else if(itemmid==3) {
				trolley.deleteitm(ob2);
			}
			else if(itemmid==4) {
				trolley.deleteitm(ob3);
			}
			else if(itemmid==5) {
				trolley.deleteitm(ob4);
			}
			
		}
		else if(op==4){
			double k=trolley.displayBill();
			System.out.println("Total Invoice is "+k);
		}
		System.out.print("You want to continue with the operations? press 1 to continue else press 0");
		int input=sd.nextInt();
		if(input==0)
			break;
		}
		
	

}
}
