package Collection_Studyall;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_2_LinkedHashset_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String>lh1=new LinkedHashSet<>();
		System.out.println(lh1.size());//not any default capacity
		
		lh1.add("city");
		lh1.add("nagar");
		lh1.add(null);
		lh1.add(null);
		lh1.add(null);
		lh1.add("nashik");
		lh1.add("mumbai");
		System.out.println(lh1);
		System.out.println("===================================");
		
		//method using in linked hashset
		//1)add method
		 System.out.println(lh1.add("city"));
		 System.out.println("======================================");
		 
		 //2)contains method
		 System.out.println(lh1.contains("nagar"));
		 System.out.println("======================================");
		 
		 
		 //3)clone method
		 System.out.println(lh1.clone());
		 System.out.println("===================================");
		 
		 //4)equal method
		 System.out.println(lh1);
		 System.out.println("=====================================");
		 
		 //5)is empty
		 System.out.println(lh1.equals("mumbai"));
		 System.out.println("======================================");
		 
		 //6)remove method(int,object)
		
		 System.out.println(lh1.remove(1));
		 System.out.println("========================================");
		
		 //7)size method
		 System.out.println(lh1.size());
		 System.out.println("======================================");
		 
		// traverssing using linkedhashset --->only iterator & for each loop 
		 
		 
		 for(String lh:lh1)
		 {
			 System.out.println(lh);//lh-is a variable 
			 System.out.println("=================================");
			 
		 }
		 System.out.println("=================================");
		         Iterator<String> lh = lh1.iterator();
		         while(lh.hasNext())
		         {
		        	 System.out.println(lh.next());
		         }
		 
		 
		 //in set interface we can't use for loop.in set for loop not work
		 
		 
		 
		 
		 
		 
		 

		 
		

	}
	
	
	


}
