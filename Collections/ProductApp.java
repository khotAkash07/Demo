
//WAP to create class name as Product with id,name and price and find the product list whose price is same and display it
import java.util.*;
class Product{
	int id;
	String name;
	int price;
	Product(int id,String name,int price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId(){return id;}
	public String getName(){return name;}
	public int getPrice(){return price;}
}
public class ProductApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		
		for(int i = 0 ; i < 4 ; i++){
			System.out.println("Enter id,price And name for product : ");
			int id = sc.nextInt();
			int price = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			Product p = new Product(id,name,price);
			v.add(p);
		}
		
		System.out.println();
		System.out.println("\nAll Products are");
		Iterator itr = v.iterator();
		while(itr.hasNext()){
			Product p = (Product) itr.next();
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getPrice());
		}
		System.out.println("\n same Price Products are");
		
		Iterator itr02 = v.iterator();
		while(itr02.hasNext()){
			Product p = (Product) itr02.next();
			int prevPrice = p.getPrice();
			Iterator itr03 = v.iterator();
			while(itr03.hasNext()){
				Product p2 = (Product) itr03.next();
				int currPrice = p2.getPrice();
				if((prevPrice == currPrice)&&(p.getId() != p2.getId())&&(p.getId() < p2.getId())){
					System.out.println("Product "+p.getId()+" And "+p2.getId()+" Having same price");
					break;
				}
			}
		}
	}
}			