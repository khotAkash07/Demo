import java.util.*;
class SquareSortApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		ArrayList al2 = new ArrayList();
		al.add(-4);
		al.add(-1);
		al.add(0);
		al.add(3);
		al.add(10);
		
	
		
		//Iterator itr = al.iterator();
		//while(itr.hasNext()){
		//	Object obj = itr.next();
		//	al2.add((int)obj*(int)obj);
		//}
		//Collections.sort(al2);
		//System.out.println(al2);

		int left = 0;
		int right = al.size()-1;
		int pos = al.size()-1;
		
		while(left<=right){
			int lsquare = (int)(al.get(left))*(int)(al.get(left));
			int rsquare = (int)(al.get(right))*(int)(al.get(right));
			if((int)(al.get(left))<(int)(al.get(right))){
				al2.add(lsquare);
				left++;
			}else{
				al2.add(lsquare);
				right--;
			}
		}
		Collections.sort(al2);
		System.out.println(al2);
	}
}