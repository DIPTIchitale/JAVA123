package Collection_Studyall;

import java.util.LinkedList;

public class List_3_linkedlist_Methods {

	public static void main(String[] args) {
		
		
		LinkedList<String>l1=new LinkedList<String>();
		l1.add("A");
		l1.add("MH");
		l1.add("N");
		l1.add("ZH");
		l1.add("NOP");
		l1.add("PA");
		l1.add(null);
		l1.add(null);
		l1.add("AB");
		System.out.println(l1);
		System.out.println("================================");
 
		//linked list using diff method
		//1)add first method
		l1.addFirst("A");
		System.out.println(l1);
		System.out.println("===================================");
		
		l1.addLast("MH");
		System.out.println(l1);
		System.out.println("================================");
		
		//l1.clear();
		//System.out.println(l1);
		System.out.println("=====================================");
		
		
		l1.clone();
		System.out.println(l1);
		System.out.println("=====================================");
		
		l1.contains(null);
		System.out.println("====================================");
		
		l1.element();
		System.out.println("========================================");
		
		l1.getFirst();
		System.out.println(l1);
		System.out.println("==============================");
		
		l1.getLast();
		System.out.println(l1);
		System.out.println("===============================");
		
		l1.indexOf("MH");
		System.out.println(l1);
		System.out.println("=============================");
		 
		l1.poll();
		System.out.println();
		System.out.println("================================");
		
		l1.peek();
		System.out.println(l1);
		System.out.println("=============================");
		
		l1.pop();
		System.out.println(l1);
		System.out.println(l1);
		System.out.println("==================================");
		
		l1.offer("MH");
		System.out.println(l1);
		System.out.println("============================================");
		
		
	}
	

}
