package Collection_Studyall;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_1_Arraylist_Traverssing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Integer>a1=new ArrayList<>();
  
  a1.add(10);
  a1.add(20);
  a1.add(30);
  a1.add(40);
  a1.add(50);
  
  System.out.println(a1);
 
  
//--------------------------FOR LOOP----------------------------//	
	System.out.println("===============FOR LOOP===================");
  
  for(int i=0;i<=a1.size()-1;i++)
  {
	  System.out.println(a1.get(i));
	  System.out.println(a1.get(i));
	  
  }  
  
  
//--------------------------FOR EACH LOOP----------------------------//	
	System.out.println("===============FOR EACH LOOP====================");
  
  for(Integer a:a1)
  {
	  System.out.println(a);
	
  }
 
  
//--------------------------ITERATOR ----------------------------//	
	System.out.println("===============ITERATOR====================");
	
    Iterator<Integer>it=a1.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
    
    
  //--------------------------lIST-ITERATOR ----------------------------//	
  		System.out.println("===============LIST-ITERATOR====================");
  		
  		 ListIterator<Integer> alit = a1.listIterator();
  		while(alit.hasNext())
  		{
  			System.out.println(alit.next());
  		}
    
  
  
		  
	  
  
	}
     
}
