package Collection_Studyall;

import java.util.Iterator;
import java.util.TreeSet;

public class SSTree_Set_collection {

	public static void main(String[] args) {
		TreeSet<Integer>ts1=new TreeSet<Integer>();
		
		ts1.add(1);
		ts1.add(12);
		ts1.add(15);
		ts1.add(10);
		ts1.add(20);
		ts1.add(12);
		ts1.add(11);
		ts1.add(20);
		ts1.add(18);
		System.out.println(ts1);
		
		System.out.println("============================================================================");
		
		//method using tree set
		


		System.out.println(ts1.add(12));	
		System.out.println("=========================");
		System.out.println(ts1.contains(10));
		System.out.println("==========================");
		System.out.println(ts1.remove(20));
		System.out.println("=========================");
		System.out.println(ts1.isEmpty());
		System.out.println("===========================");
		System.out.println(ts1.first());
		System.out.println("===========================");
		System.out.println(ts1.ceiling(14));
		System.out.println("===============================");
		System.out.println(ts1.pollFirst());
		System.out.println("=================================");
		System.out.println(ts1.pollLast());
		System.out.println("================================");
		System.out.println(ts1.clone());
		System.out.println("==================================");
//		
		//traverssing using treeset
		
		//1)iterator
			Iterator<Integer>ts=ts1.iterator();
		while(ts.hasNext())
		{
			System.out.println(ts.next());
			
		}
		 System.out.println("=====================================================================");
		 
		 
		//2)for each loop
		for(Integer fts:ts1)
		{
			System.out.println(fts);
		}
		//System.out.println("======================================================================");
		
		
		 
		
			
			
			
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
