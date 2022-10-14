package application1;

import java.util.Objects;

public class item {

	int itemid;
	String Name;
	String Description;
	int Price;
	
	public item(int it,String n,String d,int p) {
		this.itemid=it;
		this.Name=n;
		this.Description=d;
		this.Price=p;
	}
	public int getitemid() {
		return this.itemid;
	}
	public String getname() {
		return this.Name;
	}
	public String getDescription() {
		return this.Description;
	}
	public int getPrice() {
		return this.Price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(itemid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		item other = (item) obj;
		return itemid == other.itemid;
	}
}
