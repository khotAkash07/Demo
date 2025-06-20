import java.util.*;
class Book{
	//id,name,author,price,version
	int id,price;
	float version;
	String name,author;
	
	Book(int id, int price, float version, String name, String author){
		this.id = id;
		this.price = price;
		this.version = version;
		this.name = name;
		this.author = author;
	}
	public int getId(){return id;}
	public int getPrice(){return price;}
	public float getVersion(){return version;}	
	public String getName(){return name;}
	public String getAuthor(){return author;}
	
}

class LibraryManagement{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack();				
		int count = 0;
		
		do{
			System.out.println("Enter Your Choice\n1:Add Book\n2:Set Books Version Wise\n3:Search book by author and version\n4:delete book by version and bookname\n5:Show All Book\n6:Exit");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter id, Price, version, Name, Auhor Of Book : ");
					int id  = sc.nextInt();
					int price = sc.nextInt();
					float version = sc.nextFloat();
					sc.nextLine();
					String name = sc.nextLine();
					String author = sc.nextLine();
					Book b = new Book(id,price,version,name,author);
					st.push(b);
					break;
				case 2:
					st.sort((o1, o2) -> Float.compare(((Book)o2).getVersion(), ((Book)o1).getVersion()));
					Iterator itr = st.iterator();
					while(itr.hasNext()){
						Book bb = (Book) itr.next();
						System.out.println(bb.getId()+"\t"+bb.getName()+"\t"+bb.getPrice()+"\t"+bb.getVersion()+"\t"+bb.getAuthor());
					}
					break;
				case 3:
					System.out.println("Enter Author Name to search Book");
					String au_name = sc.nextLine();
					Iterator itr3 = st.iterator();
		
					while(itr3.hasNext()){
						Book bb = (Book) itr3.next();
						if(au_name.equals(bb.getAuthor())){
							System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getPrice()+"\t"+obj.getVersion()+"\t"+obj.getAuthor());
							break;
						}
					}
					break;
				case 4:
					break;
				case 5:
					Iterator itr2 = st.iterator();
					while(itr2.hasNext()){
						Book obj = (Book) itr2.next();
						System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getPrice()+"\t"+obj.getVersion()+"\t"+obj.getAuthor());
					}
					break;
				case 6:
					System.exit(0);
				default:
					System.out.println("You Enter wrong choice");
			}
			
		}while(true);
/*
		for(int i = 0 ; i < bk.length ; i++){
			bk[i] = new Book();
			System.out.println("Enter id, Price, version, Name Of Book : ");
			int id  = sc.nextInt();
			int price = sc.nextInt();
			float version = sc.nextFloat();
			sc.nextLine();
			String name = sc.nextLine();
			bk[i].setId(id);
			bk[i].setPrice(price);
			bk[i].setName(name);
			bk[i].setVersion(version);
			st.push(bk[i]);
		}
		//for(int i = 0 ; i < bk.length ; i++){
		//	st.push(bk[i]);
		//}
		
		Iterator itr = st.iterator();
		
		while(itr.hasNext()){
			Book obj = (Book) itr.next();
			System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getPrice()+"\t"+obj.getVersion());
		}
*/
	}
}