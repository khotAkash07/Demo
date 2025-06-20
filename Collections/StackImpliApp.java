import java.util.*;
class StackImpliApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		Stack st = new Stack();
		st.push(100);
		st.push(10);
		st.push(20);
		st.push(70);
		st.push(40);
		st.push(30);
		
		ListIterator itr = st.listIterator(st.size());
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}
}