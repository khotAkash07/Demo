package org.example.DSA;

import java.util.*;

class FactCalculator{
    
    public int fact(int n){
        return n==0?1: fact(n-1)*fact(n-2);
    }
}
public class FactorialRecursion {
    public static void main(String[] ars){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial :");
		int result =  new FactCalculator().fact(sc.nextInt());
		
	}	
}
