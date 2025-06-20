import java.util.*;
class LinkedHashSetApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		LinkedHashSet lhs = new LinkedHashSet(10,0.5f);
		int c = 0;
		lhs.add(50);
		lhs.add(10);
		lhs.add(10);
		lhs.add(30);
		lhs.add(70);
		lhs.add(90);
		lhs.add(80);
		lhs.add(60);
		lhs.add(58);
		lhs.add(53);
		
		for(Object obj: lhs){
			System.out.println(obj);
		}
		
		//searching....
		System.out.println("======================================================================================================== ");
		System.out.println("Enter element which you want to search:");
		int target = sc.nextInt();
		
		boolean flag = false;
		for(Object obj: lhs){
			c++;
			if((int)obj == target){
				flag = true;
				break;
			}
		}
		if(flag) System.out.println("Given element "+target+" present at "+c+" Position");
		else System.out.println("Given element is not present");
		System.out.println("======================================================================================================== ");
		//Total count
		 System.out.println("Total elements are "+lhs.size());
		System.out.println("======================================================================================================== ");
		//Remove
		boolean result = lhs.remove(80);
		System.out.println(result);
		System.out.println("After Remove element : ");
		for(Object obj: lhs){
			System.out.println(obj);
		}
		
		//Sorting
		ArrayList al = new ArrayList(lhs);
		Collections.sort(al);
		System.out.println("======================================================================================================== ");
		System.out.println("After Sorting element : ");
		for(Object obj: al){
			System.out.println(obj);
		}
		System.out.println("======================================================================================================== ");
	}
}